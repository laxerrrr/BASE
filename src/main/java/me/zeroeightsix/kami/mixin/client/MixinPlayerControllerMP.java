package me.zeroeightsix.kami.mixin.client;

import me.zeroeightsix.kami.util.LagCompensator;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Created by 086 on 3/10/2018.
 */
@Mixin(PlayerControllerMP.class)
public class MixinPlayerControllerMP {


}
