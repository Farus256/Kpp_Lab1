package kpp_lab1;

public class StringChild {
    public static String longestCommonChild(String s1, String s2) {
        // Приводим строки к нижнему регистру
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Создаем двумерный массив для хранения длин общих подстрок
        int[][] lengths = new int[s1.length()+1][s2.length()+1];

        // Заполняем массив: сравниваем символы строк и увеличиваем длину общей подстроки при совпадении
        for (int i = 0; i < s1.length(); i++)
            for (int j = 0; j < s2.length(); j++)
                if (s1.charAt(i) == s2.charAt(j))
                    lengths[i+1][j+1] = lengths[i][j] + 1;
                else
                    lengths[i+1][j+1] = Math.max(lengths[i+1][j], lengths[i][j+1]);

        // Восстанавливаем общую подстроку из массива
        StringBuilder sb = new StringBuilder();
        for (int x = s1.length(), y = s2.length(); x != 0 && y != 0; ) {
            if (lengths[x][y] == lengths[x-1][y])
                x--;
            else if (lengths[x][y] == lengths[x][y-1])
                y--;
            else {
                assert s1.charAt(x-1) == s2.charAt(y-1);
                sb.append(s1.charAt(x-1));
                x--;
                y--;
            }
        }

        // Если общая подстрока найдена, возвращаем ее, иначе возвращаем "error"
        String result;
        if (!sb.isEmpty()) {
            result = sb.reverse().toString();
        } else {
            result = "error";
        }
        System.out.println("Самая длинная общая подстрока: " + result);
        System.out.println();
        return result;
    }
}