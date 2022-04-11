import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * ЗАДАНИЕ 1. Написать класс People c полями рост, вес человека. Написать
         * компаратор для сравнения объектов класса People, который сравнивает
         * людей по индексу массы тела. Человек у которого больше индекс массы
         * тела считается больше. Создайте коллекцию People и отсортируйте ее.
         * * реализуйте компаратор используя лямбда выражение
         */

        People p1 = new People(1.7, 62.5);
        People p2 = new People(1.8, 90);
        People p3 = new People(1.6, 52);
        People p4 = new People(1.6, 49);
        People p5 = new People(1.58, 55);

        ArrayList <People> peopleArray = new ArrayList<>();
        peopleArray.add(p1);
        peopleArray.add(p2);
        peopleArray.add(p3);
        peopleArray.add(p4);
        peopleArray.add(p5);
        System.out.println(peopleArray);
        Collections.sort(peopleArray, (People x, People y) -> (x.getBMI() == y.getBMI()) ? 0 : (x.getBMI() > y.getBMI()) ? 1 : -1);
        System.out.println(peopleArray);
        System.out.println("Наибольший идекс массы тела - " + peopleArray.get(peopleArray.size()-1).getBMI() + ", наименьший - " + peopleArray.get(0).getBMI());

        /**
         * ЗАДАНИЕ 2. Написать класс Student c полями:
         * String fio;
         * Map<String, Integer> marks (ключ - предмет, значение - оценка).
         * Написать компаратор для сравнения объектов класса Student, который
         * сравнивает студентов по среднему баллу. У кого выше средний балл, тот
         * студент считается больше
         */
        Map <String, Integer> marks1 = new HashMap<>();
        marks1.put("История", 8);
        marks1.put("Философия", 9);
        marks1.put("Высшая математика", 9);
        marks1.put("Теоретическая механика", 5);
        marks1.put("Экономика", 10);
        System.out.println(marks1);
        Student st1 = new Student("Клименкова",marks1);
        System.out.println(st1);

        Map <String, Integer> marks2 = new HashMap<>();
        marks1.put("История", 5);
        marks1.put("Философия", 7);
        marks1.put("Высшая математика", 5);
        marks1.put("Теоретическая механика", 4);
        marks1.put("Экономика", 6);
        System.out.println(marks1);
        Student st2 = new Student("Сугак",marks1);
        System.out.println(st2);

        Map <String, Integer> marks3 = new HashMap<>();
        marks1.put("История", 8);
        marks1.put("Философия", 5);
        marks1.put("Высшая математика",10);
        marks1.put("Теоретическая механика", 4);
        marks1.put("Экономика", 9);
        System.out.println(marks1);
        Student st3 = new Student("Ромская",marks1);
        System.out.println(st3);

        Map <String, Integer> marks4 = new HashMap<>();
        marks1.put("История", 9);
        marks1.put("Философия", 10);
        marks1.put("Высшая математика",4);
        marks1.put("Теоретическая механика", 4);
        marks1.put("Экономика", 6);
        System.out.println(marks1);
        Student st4 = new Student("Бурсов",marks1);
        System.out.println(st4);

        ArrayList <Student> studentsArray = new ArrayList<>();
        studentsArray.add(st1);
        studentsArray.add(st2);
        studentsArray.add(st3);
        studentsArray.add(st4);
        Collections.sort(studentsArray, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getAvg() == o2.getAvg()) ? 0 : (o1.getAvg() > o2.getAvg()) ? 1 : -1;
            }
        });
        System.out.println("Сравнение по среднему баллу");
        System.out.println(studentsArray);

    }
}
