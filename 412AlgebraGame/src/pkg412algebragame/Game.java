/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412algebragame;

import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author TheMe
 */
public class Game {

    public static int max, min, score = 0, clock = 20;
    public static String question;
    public static boolean run = true;
    public static Timer t;
    public static TimerTask tt;
    public Gui g = new Gui();
    public Replay r = new Replay();
    
    public void run() 
    {
        g.setVisible(true);
        while(run = true)
        {
        tt = new TimerTask() {
            @Override
            public void run() 
            {
                g.setTime(getTime());
            }
        };
        t = new Timer();
        t.scheduleAtFixedRate(tt, 1000, 1000);
        g.setScore(score);
        repaint();
        replay();
        }
    }
    
    public static int RNG(int min, int max)
    {
        int g = (int) (Math.random() * max + min);
        return g;
    }
    
    public static boolean ADD(double a, double b, String answer)
    {
        boolean g = false;
        double c = (b-a);
        String d = "" + c;
        System.out.println(d);
        if(answer.equals(d))
            g = true;
        
        return g;
    }
    public static boolean SUB(double a, double b, String answer)
    {
        boolean g = false;
        double c = (b+a);
        String d = "" + c;
        System.out.println(d);
        if(answer.equals(d))
            g = true;
        
        return g;
    }
    public static boolean MUL(double a, double b, String answer)
    {
        boolean g = false;
        double c = (b/a);
        DecimalFormat df = new DecimalFormat("#.##");
        double p = Double.parseDouble(df.format(c));
        String d = "" + p;
        System.out.println(d);
        if(answer.equals(d))
            g = true;
        
        return g;
    }
    public static boolean DIV(double a, double b, String answer)
    {
        boolean g = false;
        double c = (b*a);
        String d = "" + c;
        System.out.println(d);
        if(answer.equals(d))
            g = true;
        
        return g;
    }
    public int getTime()
    {
        if(clock ==1)
            t.cancel();
        return clock--;
    }
    public void checkAns(int ques, double a, double b, String answer, Gui g)
    {
        boolean an = false;
        System.out.println("" + ques + " " + a + " " + b + " " + answer);
        if(ques == 1)
        {
            if(ADD(a,b,answer))
            {
                score++;
                clock+=10;
                System.out.println("correct");
                an = true;
            }
            else
            {
                run = false;
                score = 0;
                System.out.println("incorrect");
            }
        }
        if(ques == 2)
        {
            if(SUB(a,b,answer))
            {
                score++;
                clock+=10;
                an = true;
                System.out.println("correct");
            }
            else
            {
                run = false;
                score = 0;
                System.out.println("incorrect");
            }
        }
        if(ques == 3)
        {
            if(MUL(a,b,answer))
            {
                score++;
                clock+=10;
                an = true;
                System.out.println("correct");
            }
            else
            {
                run = false;
                score = 0;
                System.out.println("incorrect");
            }
        }
        if(ques == 4)
        {
            if(DIV(a,b,answer))
            {
                score++;
                clock+=10;
                an = true;
                System.out.println("correct");
            }
            else
            {
                run = false;
                score = 0;
                System.out.println("incorrect");
            }
        }

       if(an == true)
       {
           r.setAnswer("Correct");
       }
       else
       {
           r.setAnswer("Incorrect");
       }
    }
    public void replay()
    {
        g.dispose();
        t.cancel();
        r.setTime(clock);
        r.setScore(score);
        r.sc = score;
        r.ti = clock;
        r.Rep();
        r.setVisible(true);
    }
    public void repaint()
    {
        g.repaint();
        g.setVisible(true);
        int a = RNG(1,9);
        int b = RNG(1,9);
        int ans = (int)(Math.random() * 4 + 1);
        String answer = g.getAns();
        if(ans == 1)
        {
            question = ( "x + " + a + " = " + b );
            g.setQuestion(question);
        }
        if(ans == 2)
        {
            question = ( "x - " + a + " = " + b );
            g.setQuestion(question);
        }
        if(ans == 3)
        {
            question = ( "x * " + a + " = " + b );
            g.setQuestion(question);
        }
        if(ans == 4)
        {
            question = ( "x / " + a + " = " + b );
            g.setQuestion(question);
        }
        while(answer == null)
        {
            answer = g.getAns();
        }
        if(answer != null)
        {
            if(answer.contains("."))
            {
                if(answer.charAt(0) == '.')
                {
                    checkAns(ans,a,b,"0"+answer,g);
                }
            }
            else
            {
                answer = answer+".0";
                checkAns(ans,a,b,answer,g);
            }
        }
        g.setText(null);
        answer = null;
    }
}
