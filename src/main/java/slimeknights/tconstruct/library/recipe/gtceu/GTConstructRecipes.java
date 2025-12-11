package slimeknights.tconstruct.library.recipe.gtceu;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.registries.ForgeRegistries;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.fluids.TinkerFluids;
import slimeknights.tconstruct.library.fluid.GTConstructFluid;
import slimeknights.tconstruct.library.materials.definition.MaterialVariantId;
import slimeknights.tconstruct.library.utils.Util;
import slimeknights.tconstruct.tools.data.material.MaterialIds;

import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import org.apache.logging.log4j.Logger;

import static com.gregtechceu.gtceu.api.GTValues.*;

public class GTConstructRecipes {

  private static final Logger LOGGER = Util.getLogger("GTRecipes");

  private static final Set<String> FLUID_BLACKLIST = Set.of(
    "venom", "honey", "potion", "beetroot_soup", "mushroom_stew", "rabbit_stew", "meat_soup", "powdered_snow",
    "knightslime", "ichor", "magma","signalum","duralumin","refined_glowstone",
    "quartz", "debris", "clay", "glass", "liquid_soul", "obsidian", "ender",
    "emerald", "amethyst", "diamond", "nichrome", "soulsteel","refined_obsidian",
    "netherite", "tin", "zinc", "nickel", "brass", "porcelain", "uranium", "enderium", "lumium"
  );

  public static void register(Consumer<FinishedRecipe> provider) {
    Map<ResourceLocation, Fluid> tinkersFluids = GTConstructFluid.getAllTinkersFluids();

    registerSpecialRecipes(provider);

    Set<Fluid> processedSpecialFluids = Set.of(
      TinkerFluids.skySlime.get(),
      TinkerFluids.enderSlime.get(),
      TinkerFluids.earthSlime.get(),
      TinkerFluids.blazingBlood.get()
    );

    for (Map.Entry<ResourceLocation, Fluid> entry : tinkersFluids.entrySet()) {
      ResourceLocation fluidId = entry.getKey();
      String fluidPath = fluidId.getPath();
      Fluid fluid = entry.getValue();

      String materialName = GTConstructFluid.extractMaterialName(fluidPath);

      if (FLUID_BLACKLIST.contains(materialName)) {
        continue;
      }

      if (processedSpecialFluids.contains(fluid)) {
        continue;
      }


      generateStandardSolidifierRecipes(provider, fluid);
    }

  }

  private static void registerSpecialRecipes(Consumer<FinishedRecipe> provider) {
    LOGGER.info("Registering hardcoded special/hot fluid recipes...");

    GTConstructRecipeType.builder()
      .inputFluids(TinkerFluids.skySlime.get())
      .baseMaterial(MaterialIds.wood)
      .outputMaterial(MaterialIds.skySlimeskin)
      .voltage(LV)
      .register(provider);

    GTConstructRecipeType.builder()
      .inputFluids(TinkerFluids.enderSlime.get())
      .baseMaterial(MaterialIds.leather)
      .outputMaterial(MaterialIds.enderSlimeskin)
      .voltage(LV)
      .register(provider);

    GTConstructRecipeType.builder()
      .inputFluids(TinkerFluids.earthSlime.get())
      .baseMaterial(MaterialIds.wood)
      .outputMaterial(MaterialIds.slimewoodComposite)
      .voltage(LV)
      .register(provider);

    GTConstructRecipeType.builder()
      .inputFluids(TinkerFluids.blazingBlood.get())
      .baseMaterial(MaterialIds.necroticBone)
      .outputMaterial(MaterialIds.blazingBone)
      .voltage(LV)
      .register(provider);

  }

  private static void generateStandardSolidifierRecipes(Consumer<FinishedRecipe> provider, Fluid fluid) {
    String materialName = GTConstructFluid.extractMaterialName(ForgeRegistries.FLUIDS.getKey(fluid).getPath());
    MaterialVariantId outputMaterialVariantId = MaterialVariantId.tryParse(TConstruct.MOD_ID + ":" + materialName);

    GTConstructRecipeType.builder()
      .inputFluids(fluid)
      .outputMaterial(outputMaterialVariantId)
      .voltage(LV)
      .register(provider);
  }
}
