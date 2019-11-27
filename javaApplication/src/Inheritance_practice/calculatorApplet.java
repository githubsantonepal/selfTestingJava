/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance_practice;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author santoshji
 */
public class calculatorApplet extends Applet implements ActionListener {    
    String msg= " ";
    int v1,v2,result;
    TextField t1;
    Button b[]=new Button[10];
    Button add,sub,mul,div,clear,mod,EQ;
    char OP;
    @Override
public void init(){
    Color k=new Color(120,89,90);
    setBackground(k);
    t1=new TextField(10);
    GridLayout g1=new GridLayout(4,5);
    setLayout(g1);
    for(int i=0;i<10;i++){
        b[i]=new Button(""+i);
      }
      add =new Button("ADD");
      sub =new Button("SUB");
        mul =new Button("MUL");
        div =new Button("DIV");
        mod =new Button("MOD");
        clear =new Button("CLEAR");
        EQ =new Button("EQ");
        
        t1.addActionListener(this);
        add(t1);
        
        for(int i=0;i<10;i++){
            add(b[i]);
        }
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(mod);
        add(clear);
        add(EQ);
        
        for(int i=0;i<10;i++){
            b[i].addActionListener(this);
        }
	add.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	mod.addActionListener(this);
	clear.addActionListener(this);
	EQ.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String str=ae.getActionCommand();
        char ch=str.charAt(0);
	if (Character.isDigit(ch))
	t1.setText(t1.getText()+str);
        else if(str.equals("add")){
            v1=Integer.parseInt(t1.getText());
            OP='+';
            t1.setText("");
	}
	else if(str.equals("sub")){
            v1=Integer.parseInt(t1.getText());
            OP='-';
            t1.setText("");
        }
        else if(str.equals("mul")){
            v1=Integer.parseInt(t1.getText());
            OP='*';
            t1.setText("");
        }
        else if(str.equals("div")){
            v1=Integer.parseInt(t1.getText());
            OP='/';
            t1.setText("");
        }
	else if(str.equals("mod")){
            v1=Integer.parseInt(t1.getText());
            OP='%';
            t1.setText("");
	}
	
        if(str.equals("EQ")){
            v2=Integer.parseInt(t1.getText());
            switch (OP) {
                case '+':
                    result=v1+v2;
                    break;
                case '-':
                    result=v1-v2;
                    break;
                case '*':
                    result=v1*v2;
                    break;
                case '/':
                    result=v1/v2;
                    break;
                case '%':
                    result=v1%v2;
                    break;
                default:
                    break;
            }
            t1.setText(""+result);
	}	
	if(str.equals("clear")){
            t1.setText("");
	}
}
    
}
