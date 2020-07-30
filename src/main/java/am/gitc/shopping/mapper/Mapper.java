package am.gitc.shopping.mapper;

import java.util.List;

interface Mapper<Entity, Dto> {

  Dto toDto(Entity entity);

  Entity toEntity(Dto dto);

  List<Dto> toDtoList(List<Entity> entity);

  List<Entity> toEntityList(List<Dto> dto);
}
