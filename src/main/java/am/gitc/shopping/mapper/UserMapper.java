package am.gitc.shopping.mapper;

import am.gitc.shopping.dto.ProductDto;
import am.gitc.shopping.dto.UserDto;
import am.gitc.shopping.entity.ProductEntity;
import am.gitc.shopping.entity.UserEntity;

@org.mapstruct.Mapper(componentModel = "spring")
public interface UserMapper extends Mapper<UserEntity, UserDto>{
}
