package marcusdamascus.thaumcraft5revised.common.block;

import java.util.Locale;
import java.util.function.BiConsumer;
import net.minecraft.core.BlockSource;
import net.minecraft.core.Position;
import net.minecraft.core.Registry;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.core.dispenser.OptionalDispenseItemBehavior;
import net.minecraft.core.dispenser.ShearsDispenseItemBehavior;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.NotNull;

public final class TC5RevisedBlocks {
    private static final BlockBehaviour.StateArgumentPredicate<EntityType<?>> NO_SPAWN = (state, world, pos, et) -> {
        return false;
    };
    private static final BlockBehaviour.StatePredicate NO_SUFFOCATION = (state, world, pos) -> {
        return false;
    };
    // Ores and Crystals
    public static final Block oreAmber;
    public static final Block oreCinnabar;
    public static final Block crystalAir;
    public static final Block crystalEarth;
    public static final Block crystalFire;
    public static final Block crystalWater;
    public static final Block crystalOrder;
    public static final Block crystalChaos;
    public static final Block crystalBlockAir;
    public static final Block crystalBlockEarth;
    public static final Block crystalBlockFire;
    public static final Block crystalBlockWater;
    public static final Block crystalBlockOrder;
    public static final Block crystalBlockChaos;
    // Flora and Saplings
    public static final Block cinderpearl;
    public static final Block shimmerleaf;
    public static final Block vishroom;
    public static final Block silverwoodSapling;
    public static final Block greatwoodSapling;
    public static final Block etherealBloom;
    // Greatwood Blocks
    public static final Block greatwoodLog;
    public static final Block greatwoodLogStripped;
    public static final Block greatwood;
    public static final Block  greatwoodStripped;
    public static final Block greatwoodPlanks;
    public static final Block greatwoodSlab;
    public static final Block greatwoodStairs;
    public static final Block greatwoodFence;
    public static final Block greatwoodFenceGate;
    public static final Block greatwoodButton;
    public static final Block greatwoodPressurePlate;
    public static final Block greatwoodSign;
    public static final Block greatwoodTrapdoor;
    public static final Block greatwoodDoor;
    public static final Block greatwoodLeaves;
    // Silverwood Blocks
    public static final Block silverwoodLog;
    public static final Block silverwoodLogStripped;
    public static final Block silverwood;
    public static final Block silverwoodStripped;
    public static final Block silverwoodPlanks;
    public static final Block silverwoodLeaves;
    public static final Block silverwoodSlab;
    public static final Block silverwoodStairs;
    public static final Block silverwoodFence;
    public static final Block silverwoodFenceGate;
    public static final Block silverwoodButton;
    public static final Block silverwoodPressurePlate;
    public static final Block silverwoodSign;
    public static final Block silverwoodTrapdoor;
    public static final Block silverwoodDoor;
    public static final Block silverwoodLeaves;
    // Ancient and Arcane stone Blocks
    public static final Block stoneAncient;
    public static final Block stoneAncientSlab;
    public static final Block stoneAncientStairs;
    public static final Block stoneAncientBricks;
    public static final Block stoneAncientBrickSlab;
    public static final Block stoneAncientBrickStairs;
    public static final Block stoneAncientGlyph;
    public static final Block stoneAncientBrickGlyph;
    public static final Block stoneArcane;
    public static final Block stoneArcaneSlab;
    public static final Block stoneArcaneStairs;
    public static final Block stoneArcaneBricks;
    public static final Block stoneArcaneBrickSlab;
    public static final Block stoneArcaneBrickStairs;
    public static final Block stoneArcaneGlyph;
    public static final Block stoneArcaneBricksGlyph;
    // Taint Related
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
    public static final Block
}