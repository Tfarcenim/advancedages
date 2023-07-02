package net.makozort.advancedages.content.block;

import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import com.simibubi.create.content.kinetics.simpleRelays.CogWheelBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.makozort.advancedages.registry.ModBlockEntityType;

public class BronzeCogwheelBlock extends CogWheelBlock {
    protected BronzeCogwheelBlock(boolean large, Properties properties) {
        super(large, properties);
    }

    @Override
    public BlockEntityType<? extends KineticBlockEntity> getBlockEntityType() {
        return ModBlockEntityType.BRONZE_COGWHEELS.get();
    }
}