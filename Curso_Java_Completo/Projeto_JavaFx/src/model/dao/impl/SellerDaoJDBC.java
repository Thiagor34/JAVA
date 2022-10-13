package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellerDaoJDBC implements SellerDao {

    private Connection conn;

    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {
        PreparedStatement pStat = null;
        try {
            pStat = conn.prepareStatement("INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            pStat.setString(1, obj.getName());
            pStat.setString(2, obj.getEmail());
            pStat.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
            pStat.setDouble(4, obj.getBaseSalary());
            pStat.setInt(5, obj.getDepartment().getId());

            int rowsAffected = pStat.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet res = pStat.getGeneratedKeys();
                if (res.next()) {
                    int id = res.getInt(1);
                    obj.setId(id);
                }
            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(pStat);
        }
    }

    @Override
    public void update(Seller obj) {
        PreparedStatement pStat = null;
        try {
            pStat = conn.prepareStatement("UPDATE seller "
                    + " SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
                    + "WHERE Id = ?");

            pStat.setString(1, obj.getName());
            pStat.setString(2, obj.getEmail());
            pStat.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
            pStat.setDouble(4, obj.getBaseSalary());
            pStat.setInt(5, obj.getDepartment().getId());
            pStat.setInt(6, obj.getId());

            pStat.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(pStat);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement pStat = null;
        try {
            pStat = conn.prepareStatement("DELETE FROM seller WHERE Id = ?");

            pStat.setInt(1, id);
            pStat.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(pStat);
        }
    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement pStat = null;
        ResultSet res = null;
        try {
            pStat = conn.prepareStatement("SELECT seller.*, department.Name as DepName "
                    + "FROM seller INNER JOIN department "
                    + "ON seller.DepartmentId = department.Id "
                    + "WHERE seller.Id = ?");

            pStat.setInt(1, id);
            res = pStat.executeQuery();
            if (res.next()) {
                Department dep = instantiateDepartment(res);
                Seller obj = instantiateSeller(res, dep);

                return obj;
            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(pStat);
            DB.closeResultSet(res);
        }
    }

    private Seller instantiateSeller(ResultSet res, Department dep) throws SQLException {
        Seller obj = new Seller();
        obj.setId(res.getInt("Id"));
        obj.setName(res.getString("Name"));
        obj.setEmail(res.getString("Email"));
        obj.setBaseSalary(res.getDouble("BaseSalary"));
        obj.setBirthDate(new java.util.Date(res.getTimestamp("BirthDate").getTime()));
        obj.setDepartment(dep);                     //objeto department inteiro
        return obj;
    }

    private Department instantiateDepartment(ResultSet res) throws SQLException {
        Department dep = new Department();
        dep.setId(res.getInt("DepartmentId"));
        dep.setName(res.getString("DepName"));
        return dep;
    }

    @Override
    public List<Seller> findAll() {
        PreparedStatement pStat = null;
        ResultSet res = null;
        try {
            pStat = conn.prepareStatement("SELECT seller.*, department.Name as DepName "
                    + "FROM seller INNER JOIN department "
                    + "ON seller.DepartmentId = department.Id "
                    + "ORDER BY Name");

            res = pStat.executeQuery();

            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (res.next()) {

                Department dep = map.get(res.getInt("DepartmentId"));       //verifica se já existe o dep no map

                if (dep == null) {                                          //se for nulo, vai instanciar um novo dep
                    dep = instantiateDepartment(res);
                    map.put(res.getInt("DepartmentId"), dep);    //guarda um novo department no map
                }

                Seller obj = instantiateSeller(res, dep);
                list.add(obj);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(pStat);
            DB.closeResultSet(res);
        }
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement pStat = null;
        ResultSet res = null;
        try {
            pStat = conn.prepareStatement("SELECT seller.*, department.Name as DepName "
                    + "FROM seller INNER JOIN department "
                    + "ON seller.DepartmentId = department.Id "
                    + "WHERE DepartmentId = ? "
                    + "ORDER BY Name");

            pStat.setInt(1, department.getId());
            res = pStat.executeQuery();

            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (res.next()) {

                Department dep = map.get(res.getInt("DepartmentId"));       //verifica se já existe o dep no map

                if (dep == null) {                                          //se for nulo, vai instanciar um novo dep
                    dep = instantiateDepartment(res);
                    map.put(res.getInt("DepartmentId"), dep);    //guarda um novo department no map
                }

                Seller obj = instantiateSeller(res, dep);
                list.add(obj);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(pStat);
            DB.closeResultSet(res);
        }
    }
}
