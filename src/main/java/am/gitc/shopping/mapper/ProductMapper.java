package am.gitc.shopping.mapper;

import am.gitc.shopping.dto.ProductDto;
import am.gitc.shopping.entity.ProductEntity;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ProductMapper extends Mapper<ProductEntity, ProductDto> {
}
