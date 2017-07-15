package com.yc.bean;

public class FavoriteBiz {
	
	private TagDao tagDao;
	private FavoriteDao favoriteDao;
	
	
	
	public FavoriteBiz() {
		super();
		System.out.println("favoriteBiz构造");
	}
	
	
	public TagDao getTagDao() {
		return tagDao;
	}
	public void setTagDao(TagDao tagDao) {
		this.tagDao = tagDao;
	}
	public FavoriteDao getFavoriteDao() {
		return favoriteDao;
	}
	public void setFavoriteDao(FavoriteDao favoriteDao) {
		this.favoriteDao = favoriteDao;
	}
	
	
}
