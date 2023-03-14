import java.io.*;
import java.util.*;

class Student{
    String name;
    int kor, eng, math;

    Student(String name, String kor, String eng, String math){
        this.name=name;
        this.kor=Integer.parseInt(kor);
        this.eng=Integer.parseInt(eng);
        this.math=Integer.parseInt(math);
    }
}
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Student> students = new ArrayList<>();
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            students.add(new Student(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken()));
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.kor==o2.kor){
                    if(o1.eng==o2.eng){
                        if(o1.math==o2.math)
                            return o1.name.compareTo(o2.name);
                        return o2.math-o1.math;
                    }
                    return o1.eng-o2.eng;
                }
                return o2.kor-o1.kor;
            }
        });

        for(Student student : students)
            bw.write(student.name+"\n");
        bw.close();
    }
}
