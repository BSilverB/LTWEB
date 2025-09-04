package vn.iotstar.Servicesimpl;

import java.io.File;
import java.util.List;

import vn.iotstar.DAOimpl.CategoryDAOImpl;
import vn.iotstar.Models.Category;
import vn.iotstar.Services.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	CategoryDAOImpl categoryDao = new CategoryDAOImpl();

	@Override
	public void insert(Category category) {
		categoryDao.insert(category);
	}

	@Override
	public void delete(int id) {
		categoryDao.delete(id);
	}

	@Override
	public Category get(int id) {
		return categoryDao.get(id);
	}

	@Override
	public void edit(Category newCategory) {
		Category oldCategory = categoryDao.get(newCategory.getCateid());
		oldCategory.setCatename(newCategory.getCatename());
		if (newCategory.getIcon() != null) {
			// XOA ANH CU DI
			String fileName = oldCategory.getIcon();
			final String dir = "F:/HK1_25_26/LTWEB/upload";
			File file = new File(dir + "/category" + fileName);
			if (file.exists()) {
				file.delete();
			}
			oldCategory.setIcon(newCategory.getIcon());
		}
		categoryDao.edit(oldCategory);
	}

//	@Override
//	public Category get(String name) {
//	return categoryDao.get(name);
//	}
	@Override
	public List<Category> getAll() {
		
		return categoryDao.getAll();
	}
//	@Override
//	public List<Category> search(String catename) {
//	return categoryDao.search(catename);
//	}

}
