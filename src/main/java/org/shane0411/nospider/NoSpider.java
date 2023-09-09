package org.shane0411.nospider;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.EntityType;

public class NoSpider implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerEntityEvents.ENTITY_LOAD.register(((entity, world) -> {
            if (entity.getType() == EntityType.SPIDER){
                entity.remove();
                entity.removeAllPassengers();
            } else if (entity.getType() == EntityType.CAVE_SPIDER) {
                entity.remove();
                entity.removeAllPassengers();
            }
        }));
    }
}
