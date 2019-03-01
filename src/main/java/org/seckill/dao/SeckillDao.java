package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.seckill.entity.Seckill;

/**
 * @author fline123
 *
 */
public interface SeckillDao {
	/**
	 * @param seckillId
	 * @param killTime
	 * @return
	 */
	int reduceNumber(long seckillId, Date killTime);
	
	
	/**
	 * @param seckillId
	 * @return
	 */
	Seckill queryById(long seckillId);
	
	/**
	 * @return
	 */
	List<Seckill> queryAll();
	
}
