/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412algebragame;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author TheMe
 */
public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    public String ans;
    public Gui() {
        initComponents();
    }
    public void setTime(int t)
    {
        time.setText("" + t);
    }
    public void setScore(int s)
    {
        score.setText("" + s);
    }
    public void setQuestion(String q)
    {
        question.setText(q);
    }
    public void setAnswer1(String g)
    {
        Answer1.setText(g);
    }
    public void setAnswer2(String g)
    {
        Answer2.setText(g);
    }
    public void setAnswer3(String g)
    {
        Answer3.setText(g);
    }
    public void setAnswer4(String g)
    {
        Answer4.setText(g);
    }
    public String getAns()
    {
        Answer1.addActionListener(new ActionListener() 
    {

            @Override
            public void actionPerformed(ActionEvent e) {
                ans = (Answer1.getText());
                checkAns(an,a,b,ans);
            }
        });
        Answer2.addActionListener(new ActionListener() 
    {

            @Override
            public void actionPerformed(ActionEvent e) {
                ans = (Answer2.getText());
                checkAns(an,a,b,ans);
            }
        });Answer3.addActionListener(new ActionListener() 
    {

            @Override
            public void actionPerformed(ActionEvent e) {
                ans = (Answer3.getText());
                checkAns(an,a,b,ans);
            }
        });Answer4.addActionListener(new ActionListener() 
    {

            @Override
            public void actionPerformed(ActionEvent e) {
                ans = (Answer4.getText());
                checkAns(an,a,b,ans);
            }
        });
        return ans;
    }
    
    //Game
    public static int max, min, Score = 0, clock = 20, an;
    public static double a, b;
    public static String Question;
    public static boolean run;
    public static Timer t;
    public static TimerTask tt;
    public static String answer = null;
    public Replay r = new Replay();
    
    public void run() 
    {
        tt = new TimerTask() {
            @Override
            public void run() 
            {
                setTime(getTime());
            }
        };
        t = new Timer();
        t.scheduleAtFixedRate(tt, 1000, 1000);
        setScore(Score);
        //while(run = true)
        {
        play();
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
        if(answer.equals(d))
            g = true;
        
        return g;
    }
    public static boolean SUB(double a, double b, String answer)
    {
        boolean g = false;
        double c = (b+a);
        String d = "" + c;
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
        if(answer.equals(d))
            g = true;
        
        return g;
    }
    public static boolean DIV(double a, double b, String answer)
    {
        boolean g = false;
        double c = (b*a);
        String d = "" + c;
        if(answer.equals(d))
            g = true;
        
        return g;
    }
    public int getTime()
    {
        if(clock ==0)
        {
            t.cancel();
            r.setAnswer("Out of Time");
            dispose();
            replay();
        }
        
        return clock--;
    }
    public void checkAns(int ques, double a, double b, String answer)
    {
        boolean ant = false;
        if(ques == 1)
        {
            if(ADD(a,b,answer))
            {
                Score++;
                clock+=5;
                ant = true;
            }
            else
            {
                run = false;
                Score = 0;
            }
        }
        if(ques == 2)
        {
            if(SUB(a,b,answer))
            {
                Score++;
                clock+=5;
                ant = true;
            }
            else
            {
                run = false;
                Score = 0;
            }
        }
        if(ques == 3)
        {
            if(MUL(a,b,answer))
            {
                Score++;
                clock+=5;
                ant = true;
            }
            else
            {
                run = false;
                Score = 0;
            }
        }
        if(ques == 4)
        {
            if(DIV(a,b,answer))
            {
                Score++;
                clock+=5;
                ant = true;
            }
            else
            {
                run = false;
                Score = 0;
            }
        }

       if(ant == true)
       {
           r.setAnswer("Correct");
       }
       else
       {
           r.setAnswer("Incorrect");
       }
       java.awt.Window win[] = java.awt.Window.getWindows();
        for(Window win1 : win) {
            win1.dispose();
        }
       replay();
    }
    public void replay()
    {
        dispose();
        t.cancel();
        r.setTime(clock);
        r.setScore(Score-1);
        r.sc = Score-1;
        r.ti = clock;
        r.Rep();
        r.setVisible(true);
    }
    public void play()
    {
        a = RNG(1,9);
        b = RNG(1,9);
        an = (int)(Math.random() * 4 + 1);
        answer = getAns();
        double c = (double)(b/a);
        DecimalFormat df = new DecimalFormat("#.##");
        double p = Double.parseDouble(df.format(c));
        String d = "" + p;
        setAnswer1("" + (a+b));
        setAnswer2("" + (b-a));
        if(a == 1 || b == 1)
        {
            setAnswer3("" + a/b);
        }
        else {setAnswer3(d);}
        setAnswer4("" + (a*b));
        if(an == 1)
        {
            Question = ( "x + " + a + " = " + b );
            setQuestion(Question);
        }
        if(an == 2)
        {
            Question = ( "x - " + a + " = " + b );
            setQuestion(Question);
        }
        if(an == 3)
        {
            Question = ( "x * " + a + " = " + b );
            setQuestion(Question);
        }
        if(an == 4)
        {
            Question = ( "x / " + a + " = " + b );
            setQuestion(Question);
        }
       getAns();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        Answer1 = new javax.swing.JButton();
        Answer2 = new javax.swing.JButton();
        Answer3 = new javax.swing.JButton();
        Answer4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Time:");

        time.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Question:");

        question.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Score:");

        score.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        Answer1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        Answer2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answer2ActionPerformed(evt);
            }
        });

        Answer3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        Answer4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(time))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(score)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 91, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(question)
                        .addGap(239, 239, 239))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 75, Short.MAX_VALUE)
                                .addComponent(Answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Answer4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Answer3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Answer3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Answer4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(time))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(score))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(question, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(Answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Answer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Answer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Answer2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Answer1;
    private javax.swing.JButton Answer2;
    private javax.swing.JButton Answer3;
    private javax.swing.JButton Answer4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel question;
    private javax.swing.JLabel score;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
