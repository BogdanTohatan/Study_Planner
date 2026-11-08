//import uri

import model.Difficulty;
import model.Materie;
import model.SesiuneStudiu;
import model.Task;
import model.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;


public class Main {

    public static void main(String[] args) {
        // 1. Creare 3 materii
        Materie sda = new Materie(
                UUID.randomUUID(),
                "Structuri de Date si Algoritmi",
                6,
                LocalDate.of(2027, 1, 15)
        );

        Materie bazeDate = new Materie(
                UUID.randomUUID(),
                "Baze de Date",
                5,
                LocalDate.of(2027, 1, 22)
        );

        Materie sistemeOperare = new Materie(
                UUID.randomUUID(),
                "Sisteme de Operare",
                5,
                LocalDate.of(2027, 2, 2)
        );

        // 2. Creare task-uri asociate materiilor
        Task task1 = new Task(
                UUID.randomUUID(),
                "Implementare Arbore AVL",
                "Tema de laborator pentru arbori echilibrati",
                LocalDate.of(2026, 11, 20),
                Difficulty.GREU,
                TaskStatus.IN_LUCRU,
                sda
        );

        Task task2 = new Task(
                UUID.randomUUID(),
                "Proiectare Schema SQL",
                "Creare tabele si constrangeri de integritate",
                LocalDate.of(2026, 11, 25),
                Difficulty.MEDIU,
                TaskStatus.DE_FACUT,
                bazeDate
        );

        // 3. Creare sesiuni de studiu
        SesiuneStudiu sesiune1 = new SesiuneStudiu(
                UUID.randomUUID(),
                sda,
                LocalDate.now(),
                120
        );

        SesiuneStudiu sesiune2 = new SesiuneStudiu(
                UUID.randomUUID(),
                bazeDate,
                LocalDate.now().minusDays(1),
                90
        );

        // 4. Afisare in consola pentru verificare
        System.out.println("=== MATERII ===");
        System.out.println(sda);
        System.out.println(bazeDate);
        System.out.println(sistemeOperare);

        System.out.println("\n=== TASK-URI ===");
        System.out.println(task1);
        System.out.println(task2);

        System.out.println("\n=== SESIUNI STUDIU ===");
        System.out.println(sesiune1);
        System.out.println(sesiune2);
    }
}
