package name.nospider;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.mob.CaveSpiderEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SpiderEntity;

public class Nospider implements ModInitializer {
	public static final String MOD_ID = "no-spider";
    public static final Logger LOGGER = LoggerFactory.getLogger("no-spider");


	@Override
	public void onInitialize() {
		// 注册实体加载事件，当实体被加载时触发
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