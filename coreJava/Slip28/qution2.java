import javax.swing.*;

public class Question_2 {
    JFrame f;
    JTable j;

    Question_2(){
        f = new JFrame();
        f.setTitle("Employee Details");
        String data[][] = {
            {"1","Tushar","50,000"},
            {"2","Mihir","20,000"},
            {"3","ANurag","25,000"},
            {"4","Abhishekr","20,000"},
            
        };

        String[] columnNames = {"Eno", "Ename", "Salary" };
        j = new JTable(data, columnNames);
        j.setBounds(30,40,200,300);
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500,200);
        f.setVisible(true);
    }

 

    public static void main(String args[]) {

        new Question_2();

    }

}