package top.windtown.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bill
 * @className User
 * @description TODO
 * @date 2020/8/12 23:53
 * @modified By
 */
@Data
@NoArgsConstructor
public class User {
    private long id;
    private String name;

    public void add() {
        System.out.println("add..");
    }
}
