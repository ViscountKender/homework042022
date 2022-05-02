package ru.gb.siyanov;

public class HomeWorkApp {
    public static void main(String[] args) {
        Employee[] arrayEmployee = new Employee[5];
        arrayEmployee[0] = new Employee("Иван", "Иванов", "Директор", "q@mail.ru", "+7111111", 100000, 50);
        arrayEmployee[1] = new Employee("Петр", "Петров", "Бухгалтер", "w@mail.ru", "+7222222", 50000, 40);
        arrayEmployee[2] = new Employee("Анна", "Рыдаева", "Менеджер", "e@mail.ru", "+7333333", 35000, 35);
        arrayEmployee[3] = new Employee("Буян", "Вакутагин", "Водитель", "r@mail.ru", "+7444444", 25000, 20);
        arrayEmployee[4] = new Employee("Леонид", "Тюк", "Охранник", "t@mail.ru", "+7555555", 7000, 55);

        arrayEmployee[0].InformationAboutObject();

        for (int i = 0; i < arrayEmployee.length; i++) {
            if (arrayEmployee[i].getAge() > 40) {
                arrayEmployee[i].InformationAboutObject();

            }
        }


    }
}

