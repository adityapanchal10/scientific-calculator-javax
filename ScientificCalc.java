import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


class CalcFrame2 extends JFrame implements ActionListener {
	
	Container cont;
	JPanel jp;
	JTextField jf;
	JRadioButton rad, deg;
	JButton fact, round_brac_l, round_brac_r, per, ac;
	JButton cuberoot, sin, ln, num7, num8, num9, div;
	JButton pi, cos, log, num4, num5, num6, mul;
	JButton ex, tan, root, num1, num2, num3, sub;
	JButton ans, exp, xy, num0, decimal, equals, add;
	public String answer = "0";
	
	CalcFrame2 (String s) {
		super(s);
		
		//Container
		cont = getContentPane();
		cont.setLayout(null);
		
		//JPanel
		jp = new JPanel();
		jp.setBounds(0, 0, 800, 500);
		jp.setLayout(null);
		cont.add(jp);
		
		//JTextField
		jf = new JTextField(10);
		jf.setBounds(100, 30, 600, 40);
		jf.setHorizontalAlignment(SwingConstants.RIGHT);
		jp.add(jf);
		
		//JButtons 1st Row
		rad = new JRadioButton("Rad");
		rad.setBounds(90, 100, 80, 45);
		rad.setHorizontalAlignment(JRadioButton.CENTER);
		
		deg = new JRadioButton("Deg");
		deg.setBounds(180, 100, 80, 45);
		deg.setHorizontalAlignment(JRadioButton.CENTER);
		deg.setSelected(true);
		
		fact = new JButton("!");
		fact.setBounds(270, 100, 80, 45);
		
		round_brac_l = new JButton("(");
		round_brac_l.setBounds(360, 100, 80, 45);
		
		round_brac_r = new JButton(")");
		round_brac_r.setBounds(450, 100, 80, 45);
		
		per = new JButton("%");
		per.setBounds(540, 100, 80, 45);
		
		ac = new JButton("AC");
		ac.setBounds(630, 100, 80, 45);
		Border border2 = new LineBorder(Color.RED, 2, true);
		ac.setBorder(border2);
		
		
		//JButton 2nd Row
		cuberoot = new JButton("3\u221A");
		cuberoot.setBounds(90, 165, 80, 45);
		
		sin = new JButton("sin");
		sin.setBounds(180, 165, 80, 45);
		
		ln = new JButton("ln");
		ln.setBounds(270, 165, 80, 45);
		
		num7 = new JButton("7");
		num7.setBounds(360, 165, 80, 45);
		
		num8 = new JButton("8");
		num8.setBounds(450, 165, 80, 45);
		
		num9 = new JButton("9");
		num9.setBounds(540, 165, 80, 45);
		
		div = new JButton("/");
		div.setBounds(630, 165, 80, 45);
		
		
		//JButton 3rd Row
		pi = new JButton("\u03c0");
		pi.setBounds(90, 230, 80, 45);
		
		cos = new JButton("cos");
		cos.setBounds(180, 230, 80, 45);
		
		log = new JButton("log");
		log.setBounds(270, 230, 80, 45);
		
		num4 = new JButton("4");
		num4.setBounds(360, 230, 80, 45);
		
		num5 = new JButton("5");
		num5.setBounds(450, 230, 80, 45);
		
		num6 = new JButton("6");
		num6.setBounds(540, 230, 80, 45);
		
		mul = new JButton("*");
		mul.setBounds(630, 230, 80, 45);
		
		
		//JButton 4th Row
		ex = new JButton("e");
		ex.setBounds(90, 295, 80, 45);
		
		tan = new JButton("tan");
		tan.setBounds(180, 295, 80, 45);
		
		root = new JButton("\u221A");
		root.setBounds(270, 295, 80, 45);
		
		num1 = new JButton("1");
		num1.setBounds(360, 295, 80, 45);
		
		num2 = new JButton("2");
		num2.setBounds(450, 295, 80, 45);
		
		num3 = new JButton("3");
		num3.setBounds(540, 295, 80, 45);
		
		sub = new JButton("-");
		sub.setBounds(630, 295, 80, 45);
		
		
		//JButton 5th Row
		ans = new JButton("Ans");
		ans.setBounds(90, 360, 80, 45);
		
		exp = new JButton("EXP");
		exp.setBounds(180, 360, 80, 45);
		
		xy = new JButton("^");
		xy.setBounds(270, 360, 80, 45);
		
		num0 = new JButton("0");
		num0.setBounds(360, 360, 80, 45);
		
		decimal = new JButton(".");
		decimal.setBounds(450, 360, 80, 45);
		
		equals = new JButton("=");
		equals.setBounds(630, 360, 80, 45);
		Border border = new LineBorder(Color.GREEN, 2, true);
		equals.setBorder(border);
		
		add = new JButton("+");
		add.setBounds(540, 360, 80, 45);
		
		//Adding buttons to the panel
		jp.add(rad);
		jp.add(deg);
		jp.add(fact);
		jp.add(round_brac_l);
		jp.add(round_brac_r);
		jp.add(per);
		jp.add(ac);
		
		jp.add(cuberoot);
		jp.add(sin);
		jp.add(ln);
		jp.add(num7);
		jp.add(num8);
		jp.add(num9);
		jp.add(div);
		
		jp.add(pi);
		jp.add(cos);
		jp.add(log);
		jp.add(num4);
		jp.add(num5);
		jp.add(num6);
		jp.add(mul);
		
		jp.add(ex);
		jp.add(tan);
		jp.add(root);
		jp.add(num1);
		jp.add(num2);
		jp.add(num3);
		jp.add(sub);
		
		jp.add(ans);
		jp.add(exp);
		jp.add(xy);
		jp.add(num0);
		jp.add(decimal);
		jp.add(equals);
		jp.add(add);
		
		
		//Adding buttons to the action listener
		ButtonGroup bg = new ButtonGroup();
		bg.add(rad); 
		bg.add(deg);
		fact.addActionListener(this);
		round_brac_l.addActionListener(this);
		round_brac_r.addActionListener(this);
		per.addActionListener(this);
		ac.addActionListener(this);
		cuberoot.addActionListener(this);
		sin.addActionListener(this);
		ln.addActionListener(this);
		num7.addActionListener(this);
		num8.addActionListener(this);
		num9.addActionListener(this);
		div.addActionListener(this);
		pi.addActionListener(this);
		cos.addActionListener(this);
		log.addActionListener(this);
		num4.addActionListener(this);
		num5.addActionListener(this);
		num6.addActionListener(this);
		mul.addActionListener(this);
		ex.addActionListener(this);
		tan.addActionListener(this);
		root.addActionListener(this);
		num1.addActionListener(this);
		num2.addActionListener(this);
		num3.addActionListener(this);
		sub.addActionListener(this);
		ans.addActionListener(this);
		exp.addActionListener(this);
		xy.addActionListener(this);
		num0.addActionListener(this);
		decimal.addActionListener(this);
		equals.addActionListener(this);
		add.addActionListener(this);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public int getPrecedence(String ch) {

        if (ch.equals("+") || ch.equals("-"))
            return 1;
        else if (ch.equals("*") || ch.equals("/") || ch.equals("%"))
            return 2;
        else if (ch.equals("^"))
            return 3;
        else if (ch.equals("sin") || ch.equals("cos") || ch.equals("tan") || ch.equals("log") || ch.equals("ln")
                || ch.equals("\u221A") || ch.equals("3\u221A") || ch.equals("EXP") || ch.equals("!"))
            return 4;
        else
            return -1;
    }

    public boolean isOperand(String s) {
        try {
            double dValue = Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            if (s.equals("\u03c0") || s.equals("e") || s.equals("Ans"))
                return true;
            else
                return false;
        }
    }

    public boolean isFunc(String s) {
        if (s.equals("sin") || s.equals("cos") || s.equals("tan") || s.equals("log") || s.equals("ln")
                || s.equals("\u221A") || s.equals("3\u221A") || s.equals("EXP") || s.equals("!"))
            return true;
        else
            return false;
    }

    public boolean isOp(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%") || s.equals("^"))
            return true;
        else
            return false;
    }
	
	public String infixtoPostfix(String exp) {

        String[] e = exp.split(" ");
        // for (String str : e)
        // System.out.println(str);
        Stack<String> stack = new Stack<>();
        String output = new String("");
        int i;

        for (i = 0; i < e.length; ++i) {
            // Finding character at 'i'th index
            String c = e[i];

            // If the scanned Token is an operand, add it to output
            if (isOperand(c))
                output += c + " ";

            // If the scanned Token is a function, push it to stack
            else if (isFunc(c))
                stack.push(c);

            // If the scanned Token is an '(' push it to the stack
            else if (c.equals("("))
                stack.push(c);

            // If the scanned Token is an ')' pop and append it to output from the stack
            // until an '(' is encountered
            else if (c.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("("))
                    output += stack.pop() + " ";

                if (stack.peek().equals("("))
                    stack.pop();
                else if (isFunc(stack.peek()))
                	output += stack.pop() + " ";
            }

            // If an operator is encountered then taken the furthur action based on the
            // precedence of the operator

            else if (isOp(c)) {
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    // peek() inbuilt stack function to
                    // fetch the top element(token)

                    output += stack.pop() + " ";
                }
                stack.push(c);
                // System.out.println("zzzz pushed" + c);
            }
        }
        while (!stack.isEmpty())
            output += stack.pop() + " ";// + " ";
        return output;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();		
		
		if(s.equals("AC")) {
			jf.setText("");
		}
		else if(s.equals("=")) {
			String exp = infixtoPostfix(jf.getText());
			answer = evaluatePostfix(exp);
			jf.setText(answer);
		}
		else {
			if (s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9") || s.equals("\u03c0") || s.equals("e") || s.equals("Ans")) {
				jf.setText(jf.getText()+s);
			}
			else if(s.equals("ln") || s.equals("log") || s.equals("\u221A") || s.equals("3\u221A") || s.equals("sin") || s.equals("cos") || s.equals("tan")){
				jf.setText(jf.getText()+s+" ");
			}
			else if(s.equals("!"))
				jf.setText(jf.getText()+" "+s+" ");
			else if (s.equals("."))
                jf.setText(jf.getText() + s);
			else {
				jf.setText(jf.getText()+" "+s+" ");
			}
		}
	}
	
	public Double validate(String x) {
	    if (x.equals("\u03c0"))
	        return Math.PI;
	    else if (x.equals("e"))
	        return Math.E;
	    else if (x.equals("Ans"))
	        return Double.parseDouble(answer);
	    else
	    	return Double.parseDouble(x);
	}
	
	public String evaluatePostfix(String exp) {
        double res = 0;
        String[] cal = exp.split(" ");
        // create a stack
        Stack<String> stack = new Stack<>();

        // Scan all characters one by one
        for (int i = 0; i < cal.length; ++i) {

            // If the scanned character is an operand (number here),
            // push it to the stack.
            if (isOperand(cal[i]))
                stack.push(cal[i]);

            // If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else {

                if (cal[i].equals("+")) {
                    String v1 = stack.pop();
                    String v2 = stack.pop();
                    
                    double val1 = validate(v1);
                    double val2 = validate(v2);

                    // double val1 = Double.parseDouble(v1);
                    // double val2 = Double.parseDouble(v2);
                    res = val2 + val1;
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("-")) {
                    String v1 = stack.pop();
                    String v2 = stack.pop();
                    
                    double val1 = validate(v1);
                    double val2 = validate(v2);

                    // double val1 = Double.parseDouble(v1);
                    // double val2 = Double.parseDouble(v2);
                    res = val2 - val1;
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("/")) {
                    String v1 = stack.pop();
                    String v2 = stack.pop();
                    
                    double val1 = validate(v1);
                    double val2 = validate(v2);

                    // double val1 = Double.parseDouble(v1);
                    // double val2 = Double.parseDouble(v2);
                    res = val2 / val1;
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("*")) {
                    String v1 = stack.pop();
                    String v2 = stack.pop();
                    
                    double val1 = validate(v1);
                    double val2 = validate(v2);

                    // double val1 = Double.parseDouble(v1);
                    // double val2 = Double.parseDouble(v2);
                    res = val2 * val1;
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("%")) {
                    String v1 = stack.pop();
                    String v2 = stack.pop();
                    
                    double val1 = validate(v1);
                    double val2 = validate(v2);

                    // double val1 = Double.parseDouble(v1);
                    // double val2 = Double.parseDouble(v2);
                    res = val2 % val1;
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("!")) {
                    String v = stack.pop();
                    double val;
                    if (v.equals("\u03c0") || v.equals("e")) {
                    	val = 3;
                    }
                    else if (v.equals("ans")) {
                    	val = Double.parseDouble(v);
                	}
                    else {
                    	val = Double.parseDouble(v);
                    }
                    res = 1;
                    while (val > 0) {
                        res *= val;
                        val--;
                    }
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("ln")) {
                    String v = stack.pop();
                    
                    double val = validate(v);
                    
                    // Double val = Double.parseDouble(v);
                    res = Math.log(val);
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("log")) {
                    String v = stack.pop();
                    
                    double val = validate(v);
                    
                    // Double val = Double.parseDouble(v);
                    res = Math.log10(val);
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("sin")) {
                    String v = stack.pop();
                    
                    double val = validate(v);
                    
                    // Double val = Double.parseDouble(v);
                    if (deg.isSelected())
                    	val = Math.toRadians(val);
                    res = Math.sin(val);
                    res = (double) Math.round(res * 100000d) / 100000d;
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("cos")) {
                    String v = stack.pop();
                    
                    double val = validate(v);
                    
                    // Double val = Double.parseDouble(v);
                    
                    if (deg.isSelected())
                    	val = Math.toRadians(val);
                    res = Math.cos(val);
                    res = (double) Math.round(res * 100000d) / 100000d;
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("tan")) {
                    String v = stack.pop();
                    
                    double val = validate(v);
                    
                    // Double val = Double.parseDouble(v);
                    if (deg.isSelected())
                    	val = Math.toRadians(val);
                    res = Math.tan(val);
                    res = (double) Math.round(res * 100000d) / 100000d;
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("\u221A")) {
                    String v = stack.pop();
                    
                    double val = validate(v);
                    
                    // Double val = Double.parseDouble(v);
                    res = Math.sqrt(val);
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("3\u221A")) {
                    String v = stack.pop();
                    
                    double val = validate(v);
                    
                    // Double val = Double.parseDouble(v);
                    res = Math.cbrt(val);
                    stack.push(Double.toString(res));
                } 
                else if (cal[i].equals("EXP")) {
                    String v1 = stack.pop();
                    String v2 = stack.pop();
                    
                    double val1 = validate(v1);
                    double val2 = validate(v2);

                    // double val1 = Double.parseDouble(v1);
                    // double val2 = Double.parseDouble(v2);
                    while (val1 > 0) {
                        val2 *= 10;
                        val1--;
                    }
                    res = val2;
                    stack.push(Double.toString(res));
                }
                else if (cal[i].equals("^")) {
                    String v1 = stack.pop();
                    String v2 = stack.pop();
                    
                    double val1 = validate(v1);
                    double val2 = validate(v2);

                    // double val1 = Double.parseDouble(v1);
                    // double val2 = Double.parseDouble(v2);
                    if (val1 == 0)
                        res = 1.0;
                    else {
                        while (val1 > 1) {
                            val2 *= val2;
                            val1--;
                        }
                        res = val2;
                    }
                    stack.push(Double.toString(res));
                }
            }
        }
        return stack.pop();
    }
}


public class ScientificCalc {

	public static void main(String[] args) {
		CalcFrame2 f = new CalcFrame2("Scientific Calculator");
		f.setVisible(true);
		f.setSize(820, 500);
		f.getContentPane().setLayout(null);
	}
}
