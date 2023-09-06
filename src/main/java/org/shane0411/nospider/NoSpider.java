package org.shane0411.nospider;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.mob.CaveSpiderEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SpiderEntity;

public class NoSpider implements ModInitializer {

	@Override
	public void onInitialize() {
		ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> {
			if (entity.getType() == EntityType.SPIDER && entity instanceof SpiderEntity) {
				// 取消蜘蛛的生成
				entity.discard();
			} else if (entity.getType() == EntityType.CAVE_SPIDER && entity instanceof CaveSpiderEntity) {
				entity.discard();
			}
		});
	}
}