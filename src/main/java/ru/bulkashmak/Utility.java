package ru.bulkashmak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utility {

    public static void reader() throws IOException{

        BufferedReader brStudents = new BufferedReader(new FileReader("files/students.txt"));
        BufferedReader brQuestions = new BufferedReader(new FileReader("files/questions.txt"));

        String lineFromStudents;
        String lineFromQuestions;

        List<String> linesFromStudents = new ArrayList<>();
        List<String> linesFromQuestions = new ArrayList<>();

        while (((lineFromStudents = brStudents.readLine()) != null) &&
                ((lineFromQuestions = brQuestions.readLine()) != null)) {
            linesFromStudents.add(lineFromStudents);
            linesFromQuestions.add(lineFromQuestions);
        }

        FileWriter fileWriter = new FileWriter(
                String.format("files/вопросы-%s.txt", LocalDate.now()),
                false);

        Random random = new Random();
        int tmp = 0;
        String dataToWrite;
        for (String lineS : linesFromStudents) {

            tmp = random.nextInt(linesFromQuestions.size());
            dataToWrite = lineS +" | "+ linesFromQuestions.get(tmp);
            fileWriter.write(dataToWrite);
            linesFromQuestions.remove(tmp);
        }


//        FileWriter fr = new FileWriter("myhappyfile1.txt", false);
//        String dataToWrite = "Проверка на запись 123132 fdgsdgsd latin";
//        fr.write(dataToWrite);
//        fr.close();
    }
}
