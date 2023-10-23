package HW;

public class HOMEWORK2 {
    public static void main(String[] args) {
//        1)
//        Создать переменную string1 = "This line that i want to cut, cause it is
//        too long".
//        Создать строку string2 в которой должно быть помещено значение строки
//        string1,
//        Обрезанное до "This line that i want to cut, cause".
//        Создать строку string3 на основе string2 которое будет содержать
//        значение
//        "This line that I want to cut, cause it is perfect".
//         Вывести на консоль каждое сообщение и его длину.

        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println(string1);
        System.out.println(string1.length());
        String string2 = string1.substring(0, 36);
        System.out.println(string2);
        System.out.println(string2.length());
        String string3 = string2.replace("This line that i want to cut", "This line that i don't want to cut") + "it is perfect";
        System.out.println(string3);
        System.out.println(string3.length());


//        2)
//        Создать строку string = "Testing, is my favourite job".
//        Вывести на экран отдельно каждое слово и длину этого слова в след виде:
//        Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
//        Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
//        и т.д.
//       Вывести на консоль true, если первое слово длиннее остальных, в
////     противном случае вывести false.

        String strings = "Testing, is my favourite job";


        System.out.println(strings.split("\\s")[0].replace(",", "") + "=" + strings.split("\\s")[0].length());
        System.out.println(strings.split("\\s")[1] + "=" + strings.split("\\s")[1].length());
        System.out.println(strings.split("\\s")[2] + "=" + strings.split("\\s")[2].length());
        System.out.println(strings.split("\\s")[3] + "=" + strings.split("\\s")[3].length());
        System.out.println(strings.split("\\s")[4] + "=" + strings.split("\\s")[4].length());

        int word1 = strings.split("\\s")[0].replace(",", "").length();
        int word2 = strings.split("\\s")[1].length();
        int word3 = strings.split("\\s")[2].length();
        int word4 = strings.split("\\s")[3].length();
        int word5 = strings.split("\\s")[4].length();
        boolean result = (word1 > word2) && (word1 > word3) && (word1 > word4) && (word1 > word5);
        System.out.println(result);

//        3)
//        "При применении к массиву строк поля length, можно узнать сколько
//        элементов находится в массиве.
//        Тоесть если у Вас есть массив строк типа: String[] arrayOfString;
//        то при вызове поля lenth: int size = arrayOfString.length;
//         Попробовать, используя метод split и информацию по поводу поля length, вывести на экран какое количество раз
//        символ 'a' встречается в  строке:
//        "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method."
////        Решить данную задачу с учетов верхнего и нижнего регистра символа 'a'.


        String string = "Completely random text in English. In it, we just need" +
                " to determine how many times the character 'a' occurs there. A" +
                "nd we can use the split method and the length method.";
        String[] arrayOfString = string.split("a");
        int size = arrayOfString.length;
        System.out.println(size);


    }}

















