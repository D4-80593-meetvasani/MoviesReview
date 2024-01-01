package com.sunbeam;

import java.util.List;

public interface MovieDao extends AutoCloseable{
	public List<Movies> findAll() throws Exception;

}
