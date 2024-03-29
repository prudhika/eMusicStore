package com.emusicstore.dao.impl;
import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


//@Transactional -that class -database executes but not commit/ roll  back-if atomitcity
@Repository
@Transactional
@EnableTransactionManagement
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void  addProduct(Product product){
        //Session factory singleton
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

    public Product getProductByID(String id){

        Session session=sessionFactory.getCurrentSession();
        Product product=(Product) session.get(Product.class,id);

        return product;
    }

    public List<Product> getAllProducts(){
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from Product");
        List<Product> products=query.list();
        session.flush();

        return products;
    }

    public void deleteProduct(String id){
        Session session=sessionFactory.getCurrentSession();
        session.delete(getProductByID(id));
        session.flush();
    }
}
