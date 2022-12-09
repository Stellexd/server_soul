package com.PanConQuesoZ.soulsrpg.core.init;

import com.PanConQuesoZ.soulsrpg.SoulsRPGmain;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS,
            SoulsRPGmain.MOD_ID);
    //primer bloque
    public static final RegistryObject<Block> PRIMER_BLOQUE = BLOCKS
            .register("primer_bloque",
                    () -> new Block(AbstractBlock.Properties.of(AbstractBlock., MaterialColor.COLOR_BLACK)
                            .strength(2.0f, 15f)
                            .harvestLevel(2)
                            .harvestTool(ToolType.PICKAXE)
                            .sound(SoundType.STONE)));
}
