package icu.sd.trade.mapper;

import icu.sd.trade.entity.Favorite;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:
 * @Date:2024/12-8 10:38
 * @Version:v1.0.0
 * @Description:收藏数据持久层
 **/
@Mapper
public interface FavoriteMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Favorite record);

    int insertSelective(Favorite record);

    Favorite selectByPrimaryKey(Long id);

    List<Favorite> getMyFavorite(Long userId);

    Integer checkFavorite(Long userId, Long idleId);

    int updateByPrimaryKeySelective(Favorite record);

    int updateByPrimaryKey(Favorite record);
}
