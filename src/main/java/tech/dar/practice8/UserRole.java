package tech.dar.practice8;

/*
    Создайте перечисление UserRole с ролями USER, ADMIN, GUEST.
    Для каждой роли определите уровень доступа
    (например, 0 для гостя, 1 для пользователя и 2 для администратора).
    Напишите метод, который проверяет, достаточен ли уровень доступа
    пользователя для выполнения действия, требующего определенного уровня доступа.
 */
public enum UserRole {

    USER(1), ADMIN(2), GUEST(0);

    private final int level;

    UserRole(int level) {
        this.level = level;
    }

    public static boolean hasRight(UserRole role, int requiredLevel) {
        return role.level >= requiredLevel;
    }

}
