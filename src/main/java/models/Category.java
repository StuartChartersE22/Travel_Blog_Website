package models;

import behaviours.IDB;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category implements IDB {

    private int id;
    private String name;
    private List<Article> articles;

    public Category (){}

    public Category(String name){
        this.name = name;
    }

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "articles_categories",
            joinColumns = {@JoinColumn (name = "category_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "article_id", nullable = false, updatable = false)})
    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
