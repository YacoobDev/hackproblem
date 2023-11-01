import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> gradeRoundedList = new ArrayList<>();
        grades.stream().forEach(grade -> {
            if(grade>=38){
                int nextGradeWithMultiple5 = grade%5;
                if(nextGradeWithMultiple5>=3){
                    nextGradeWithMultiple5 = grade + (5-nextGradeWithMultiple5);
                    gradeRoundedList.add(nextGradeWithMultiple5);
                } else {
                    gradeRoundedList.add(grade);
                }
            } else {
                gradeRoundedList.add(grade);
            }
        });

        // List<Integer> gradeRoundedList = new ArrayList<>();
        // for (Integer grade : grades) {
        //     if(grade>38){
        //         int nextGradeWithMultiple5 = grade%5;
        //         if(nextGradeWithMultiple5>=3){
        //             nextGradeWithMultiple5 = grade + (5-nextGradeWithMultiple5);
        //             gradeRoundedList.add(nextGradeWithMultiple5);
        //         }else{
        //             gradeRoundedList.add(grade);
        //         }
        //     } else {
        //         gradeRoundedList.add(grade);
        //     }
        // }
        System.out.println(gradeRoundedList);
        return gradeRoundedList;
    }

}

public class GradeStudents {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        // List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
        //     try {
        //         return bufferedReader.readLine().replaceAll("\\s+$", "");
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // })
        //     .map(String::trim)
        //     .map(Integer::parseInt)
        //     .collect(toList());

        // List<Integer> result = Result.gradingStudents(grades);

        // bufferedWriter.write(
        //     result.stream()
        //         .map(Object::toString)
        //         .collect(joining("\n"))
        //     + "\n"
        // );

        // bufferedReader.close();
        // bufferedWriter.close();

        //Test
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        grades.add(98);
        grades.add(44);

        Result.gradingStudents(new ArrayList<>());
    }
}
