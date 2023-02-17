package net.DEAMJAVA.random.mixin;

import net.DEAMJAVA.random.util.IEntityDataSaver;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Entity.class)
public abstract class ModEntityDataSaverMixin implements IEntityDataSaver {
    private NbtCompound pData;

    @Overwrite
    public NbtCompound getpData() {
        if (this.pData == null) {
            this.pData = new NbtCompound();
        }
        return pData;
    }

}
