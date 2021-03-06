package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by Humin on 2/3/14.
 */
@Entity
public class Egg extends Model {

    @Id
    public Long id;

    @ManyToOne
    public User user;

    @ManyToOne
    public Goods goods;

    public Date create_at = new Date();

    public Date update_at = new Date();

    public static Finder<Long, Egg> find = new Finder<Long, Egg>(
            Long.class, Egg.class
    );
}
