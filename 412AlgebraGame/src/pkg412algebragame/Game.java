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

    public static int max, min, Score = 0, clock = 20;
    public static String Question;
    public static boolean run;
    public static Timer t;
    public static TimerTask tt;
    public static String answer = null;
    public Gui g = new Gui();
    public Replay r = new Replay();
    
    public void run() 
    {
        //g.setVisible(true);
        tt = new TimerTask() {
            @Override
            public void run() 
            {
                g.setTime(getTime());
            }
        };
        t = new Timer();
        t.scheduleAtFixedRate(tt, 1000, 1000);
        g.setScore(Score);
        //while(run = true)
        {
        repaint();
        replay();
        run = false;
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
    public void checkAns(int ques, double a, double b, String answer)
    {
        boolean an = false;
        System.out.println("" + ques + " " + a + " " + b + " " + answer);
        if(ques == 1)
        {
            if(ADD(a,b,answer))
            {
                Score++;
                clock+=10;
                System.out.println("correct");
                an = true;
            }
            else
            {
                run = false;
                Score = 0;
                System.out.println("incorrect");
            }
        }
        if(ques == 2)
        {
            if(SUB(a,b,answer))
            {
                Score++;
                clock+=10;
                an = true;
                System.out.println("correct");
            }
            else
            {
                run = false;
                Score = 0;
                System.out.println("incorrect");
            }
        }
        if(ques == 3)
        {
            if(MUL(a,b,answer))
            {
                Score++;
                clock+=10;
                an = true;
                System.out.println("correct");
            }
            else
            {
                run = false;
                Score = 0;
                System.out.println("incorrect");
            }
        }
        if(ques == 4)
        {
            if(DIV(a,b,answer))
            {
                Score++;
                clock+=10;
                an = true;
                System.out.println("correct");
            }
            else
            {
                run = false;
                Score = 0;
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
        r.setScore(Score);
        r.sc = Score;
        r.ti = clock;
        r.Rep();
        r.setVisible(true);
    }
    public void repaint()
    {
        g.setVisible(true);
        //g.repaint();
        int a = RNG(1,9);
        int b = RNG(1,9);
        int ans = (int)(Math.random() * 4 + 1);
        answer = g.getAns();
        if(ans == 1)
        {
            Question = ( "x + " + a + " = " + b );
            g.setQuestion(Question);
        }
        if(ans == 2)
        {
            Question = ( "x - " + a + " = " + b );
            g.setQuestion(Question);
        }
        if(ans == 3)
        {
            Question = ( "x * " + a + " = " + b );
            g.setQuestion(Question);
        }
        if(ans == 4)
        {
            Question = ( "x / " + a + " = " + b );
            g.setQuestion(Question);
        }
        if(answer == null || answer.equals(".0"))
        {
            answer = null;
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
                    checkAns(ans,a,b,"0"+answer);
                }
            }
            else
            {
                answer = answer+".0";
                checkAns(ans,a,b,answer);
            }
        }
        answer = null;
    }
}
