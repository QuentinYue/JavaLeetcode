//package stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class nibolj {
    public static void main(String[] args) {
        /* 逆波兰计算器的验证代码 */
        /*// 先定义一个逆波兰表达式
        // (3+4)*5-6 => 34+5*6-
        // 为了方便，逆波兰表达式中的数字和符号使用空格隔开
        String suffixExpression = "3 4 + 5 * 6 - ";
        // 思路
        // 1. 先将"3 4 + 5 * 6 - "放到一个ArrayList中
        // 2. 将ArrayList传递给一个方法，遍历配合栈完成计算
        List<String> rpnList = getListString(suffixExpression);
        System.out.println(rpnList);

        int res = calculate(rpnList);
        System.out.println("计算的结果是：" + res);*/

        /*中缀转后缀测试*/
        // 完成将一个中缀表达式转成后缀表达式的功能
        // 说明
        // 1. 1+((2+3)*4)-5 转成 1 2 3 + 4 * + 5 -
        // 2. 因为直接对str进行操作不方便，因此先将"1+((2+3)*4)-5"转成其对应的中缀表达式的List
        //    即："1+((2+3)*4)-5" => ArrayList[1,+,(,(,2,+,3,),*,4,),-,5]
        // 3. 将得到的一个中缀表达式对应的List => 后缀表达式对应的List
        //    即：ArrayList[1,+,(,(,2,+,3,),*,4,),-,5] => ArrayList[1,2,3,+,4,*,+,5,-]

        String exception = "1+((2+3)*4)-5";
        List<String> list = toInFixExpressionList(exception);
        System.out.println("中缀表达式对应的List:" + list);

        List<String> list1 = parseSuffixExpressionList(list);
        System.out.println("后缀表达式对应的List:" + list1);

        System.out.println(calculate(list1));
    }

    // 将得到的一个中缀表达式对应的List => 后缀表达式对应的List
    // 即：ArrayList[1,+,(,(,2,+,3,),*,4,),-,5] => ArrayList[1,2,3,+,4,*,+,5,-]
    public static List<String> parseSuffixExpressionList(List<String> ls) {
        // 定义两个栈
        Stack<String> s1 = new Stack<String>(); // 符号栈
        // 说明：因为s2这个栈，在整个转换过程中，没有pop操作，而且后面我们还需要逆序输出
        // 因此比较麻烦，这里我们就不用Stack<String> 直接使用List<String> s2 代替
        //Stack<String> s2 = new Stack<String>(); // 储存中间结果s2
        List<String> s2 = new ArrayList<String>();
        // 遍历ls
        for (String item : ls) {
            // 如果是一个数，就加入s2
            if (item.matches("\\d+")) {
                s2.add(item);
            } else if (item.equals("(")) {
                s1.push(item);
            } else if (item.equals(")")) {
                // 如果是右括号")"，则依次弹出s1栈顶的运算符，并压入s2，知道遇到左括号为止，此时将这一对括号丢弃
                while (!s1.peek().equals("(")) {
                    s2.add(s1.pop());
                }
                s1.pop();   // 将"("小括号弹出s1栈，消除小括号
            } else {
                // 当item优先级小于等于s1栈顶运算符优先级，将s1栈顶的运算符弹出并加入s2，重复该工作
                // 问题：缺少一个比较优先级高度的方法
                while (s1.size() != 0 && Operation.getValue(s1.peek()) >= Operation.getValue(item)) {
                    s2.add(s1.pop());
                }
                // 还需要将item压入栈
                s1.push(item);
            }
        }

        // 将s1中剩余的运算符依次弹出并加入s2
        while (s1.size() != 0) {
            s2.add(s1.pop());
        }

        return s2; // 注意因为存放到List，因此按顺序输出就是对应的后缀表达式
    }

    // 方法：将中缀表达式转成对应List
    public static List<String> toInFixExpressionList(String s) {
        // 定义一个List，存放中缀表达式对应的内容
        List<String> ls = new ArrayList<String>();
        int index = 0;   // 索引，用于遍历中缀表达式字符串
        String str = "";    // 对多位数的拼接工作
        char c = ' ';   // 每遍历到一个字符，就放入到c中
        do {
            // 如果c是一个非数组，就需要加入到ls中
            c = s.charAt(index);
            if (c < 48 || c > 57) { //非数字
                ls.add("" + c);
                index++;
            } else {  // 如果是数字，需要考虑多位数拼接
                str = ""; // 先将str清空    '0'=>[48] '9'=>[57]
                while (index < s.length() && (c = s.charAt(index)) >= 48 && (c = s.charAt(index)) <= 57) {
                    str += c;
                    index++;
                }
                ls.add(str);
            }
        } while (index < s.length());
        return ls;
    }

    //

    // 将逆波兰表达式依次将数据和运算符放入ArrayList中
    public static List<String> getListString(String suffixExpression) {
        // 将suffixExpression分割
        String[] split = suffixExpression.split(" ");
        List<String> list = new ArrayList<String>();
        for (String ele : split) {
            list.add(ele);
        }
        return list;
    }

    // 完成对逆波兰表达式运算
    /*
     * 1）从左至右扫描，将3和4压入堆栈
     * 2）遇到 + 运算符，因此弹出4和3（4为栈顶元素，3位次顶元素），计算出3+4的值，得7，将7入栈
     * 3）将5入栈
     * 4）加下来是 × 运算符，因此弹出5和7，计算7*5=35，将35入栈
     * 5）将6入栈
     * 6）最后是 - 运算符，计算35-6的值，即29，由此得到最终答案
     * */
    public static int calculate(List<String> ls) {
        // 创建栈
        Stack<String> stack = new Stack<String>();
        // 遍历ls
        for (String item : ls) {
            // 使用正则表达式取出数组
            if (item.matches("\\d+")) {   // 匹配的是多位数
                stack.push(item);
            } else {
                // pop出两个数，并运算，再入栈
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if (item.equals("+")) {
                    res = num1 + num2;
                } else if (item.equals("-")) {
                    res = num1 - num2;
                } else if (item.equals("*")) {
                    res = num1 * num2;
                } else if (item.equals("/")) {
                    res = num1 / num2;
                } else {
                    throw new RuntimeException("运算符有误");
                }
                // res 入栈
                stack.push("" + res);
            }
        }
        // 最后留在stack中的数据就是运算结果
        return Integer.parseInt(stack.pop());
    }
}

// 编写一个类 Operation 返回一个运算符对应的优先级
class Operation {
    private static int ADD = 1;
    private static int SUB = 1;
    private static int MUL = 2;
    private static int DIV = 2;

    // 写一个方法，返回对应的优先级数字
    public static int getValue(String Operation) {
        int result = 0;
        switch (Operation) {
            case "+":
                result = ADD;
                break;
            case "-":
                result = SUB;
                break;
            case "*":
                result = MUL;
                break;
            case "/":
                result = DIV;
                break;
            default:
                System.out.println("不存在该运算符");
                break;
        }
        return result;
    }
}



