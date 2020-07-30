package am.gitc.shopping.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@Entity(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String img;

    private String title;

    private String text;

    private double price;

    @Column(name = "old_price")
    private double oldPrice;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

    private String images;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CategoryEntity> categories;

    public String[] getImages() {
        return images.split(",");
    }

}
