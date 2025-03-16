package ua.job4j.cars.util;

import org.springframework.ui.Model;
import ua.job4j.cars.model.User;

import javax.servlet.http.HttpSession;

public class GuestUtil {

    private GuestUtil() {
    }

    public static void checkAndSetGuestName(Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            user = new User();
            user.setLogin("Гість");
        }
        model.addAttribute("user", user);
    }
}
