//import db.DBHelper;
//import db.helpers.*;
//import models.*;
//
//import java.util.List;
//
//public class Runner {
//
//    public static void main(String[] args) {
//
//        DBArticle.deleteAll();
//        DBWriter.deleteAll();
//        DBCategory.deleteAll();
//        DBTag.deleteAll();
//        DBVisitor.deleteAll();
//
//        Category category = new Category("America");
//        DBHelper.save(category);
//
//        Tag tag = new Tag("food");
//        DBHelper.save(tag);
//
//        Visitor visitor = new Visitor("Stuart");
//        DBHelper.save(visitor);
//
//        Writer writer1 = new Writer("Helen", "blurb");
//        DBHelper.save(writer1);
//
//        Writer writer2 = new Writer("Ron", "blurb");
//        DBHelper.save(writer2);
//
//        Article article1 = new Article("Travelling", writer1, "content", "summary" );
//        DBHelper.save(article1);
//
//        Article article2 = new Article("Wandering", writer2, "content", "summary" );
//        DBHelper.save(article2);
//
//        Article article3 = new Article("Road Trip", writer1, "content", "summary" );
//        DBHelper.save(article3);
//
//        article1.addTag(tag);
//        article1.addCategory(category);
//        DBHelper.update(article1);
//
//
//        Article foundArticle = DBArticle.find(article1.getId());
//        Writer articleWriter = DBArticle.getWriterForArticle(foundArticle);
//
//        DBVisitor.saveArticleForVisitor(visitor, foundArticle);
//        Visitor foundVisitor = DBVisitor.find(visitor.getId());
//        List<Article> foundSavedArticles = DBVisitor.getSavedArticlesForVisitor(foundVisitor);
//
//
////        List<Tag> foundTags = DBArticle.getTagsForArticle(foundArticle);
////        List<Category> foundCategories = DBArticle.getCategoriesForArticle(foundArticle);
//        List<Article> foundCategoryArticles = DBCategory.getArticlesForCategory(category);
//        List<Article> foundTagArticles = DBTag.getArticlesForTag(tag);
//
////        DBArticle.removeCategoryFromArticle(foundArticle, category);
////        DBArticle.removeTagFromArticle(foundArticle, tag);
//
//        foundArticle = DBArticle.find(article1.getId());
//
//        List<Category> foundCategories = DBArticle.getCategoriesForArticle(foundArticle);
//        List<Tag> foundTags = DBArticle.getTagsForArticle(foundArticle);
//
//
//
//        System.exit(0);
//    }
//}
