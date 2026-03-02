```mermaid
flowchart TD
  N0[slimeknights/tconstruct/TConstruct.java]:::ext
  N1[tconstruct/common/Sounds.java]:::ext
  N2[tconstruct/common/TinkerDamageTypes.java]:::ext
  N3[tconstruct/common/TinkerTags.java]:::ext
  N4[common/config/Config.java]:::ext
  N5[common/data/AdvancementsProvider.java]:::ext
  N6[common/data/ConfigurationDataProvider.java]:::ext
  N7[data/loot/BlockLootTableProvider.java]:::ext
  N8[data/loot/EntityLootTableProvider.java]:::ext
  N9[data/loot/GlobalLootModifiersProvider.java]:::ext
  N10[data/loot/LootTableInjectionProvider.java]:::ext
  N11[data/model/TinkerBlockStateProvider.java]:::ext
  N12[data/model/TinkerItemModelProvider.java]:::ext
  N13[data/render/RenderFluidProvider.java]:::ext
  N14[data/render/RenderItemProvider.java]:::ext
  N15[data/tags/BlockEntityTypeTagProvider.java]:::ext
  N16[data/tags/BlockTagProvider.java]:::ext
  N17[data/tags/FluidTagProvider.java]:::ext
  N18[data/tags/ItemTagProvider.java]:::ext
  N19[data/tags/MenuTypeTagProvider.java]:::ext
  N20[common/json/ConfigEnabledCondition.java]:::ext
  N21[common/multiblock/IServantLogic.java]:::ext
  N22[common/network/InventorySlotSyncPacket.java]:::ext
  N23[common/network/TinkerNetwork.java]:::ext
  N24[common/registration/GeodeItemObject.java]:::ext
  N25[tconstruct/fluids/FluidClientEvents.java]:::core
  N26[tconstruct/fluids/FluidEvents.java]:::core
  N27[tconstruct/fluids/TinkerFluids.java]:::core
  N28[fluids/block/BurningLiquidBlock.java]:::core
  N29[fluids/block/MobEffectLiquidBlock.java]:::core
  N30[fluids/block/package-info.java]:::core
  N31[fluids/data/FluidBlockstateModelProvider.java]:::core
  N32[fluids/data/FluidBucketModelProvider.java]:::core
  N33[fluids/data/FluidTextureProvider.java]:::core
  N34[fluids/data/FluidTooltipProvider.java]:::core
  N35[fluids/data/package-info.java]:::core
  N36[fluids/fluids/PotionFluidType.java]:::core
  N37[fluids/fluids/SlimeFluid.java]:::core
  N38[fluids/fluids/package-info.java]:::core
  N39[fluids/item/BottleItem.java]:::core
  N40[fluids/item/ContainerFoodItem.java]:::core
  N41[fluids/item/EmptyPotionTransfer.java]:::core
  N42[fluids/item/MagmaBottleItem.java]:::core
  N43[fluids/item/PotionBucketItem.java]:::core
  N44[fluids/item/package-info.java]:::core
  N45[tconstruct/fluids/package-info.java]:::core
  N46[fluids/util/BottleBrewingRecipe.java]:::core
  N47[fluids/util/ConstantFluidContainerWrapper.java]:::core
  N48[fluids/util/EmptyBottleIntoEmpty.java]:::core
  N49[fluids/util/EmptyBottleIntoWater.java]:::core
  N50[fluids/util/FillBottle.java]:::core
  N51[fluids/util/package-info.java]:::core
  N52[tconstruct/gadgets/TinkerGadgets.java]:::ext
  N53[gadgets/block/FoodCakeBlock.java]:::ext
  N54[gadgets/data/GadgetRecipeProvider.java]:::ext
  N55[tconstruct/library/TinkerItemDisplays.java]:::ext
  N56[library/client/GuiUtil.java]:::ext
  N57[library/client/RenderUtils.java]:::ext
  N58[library/client/SafeClient.java]:::ext
  N59[library/client/TinkerRenderTypes.java]:::ext
  N60[book/elements/FluidItemElement.java]:::ext
  N61[client/model/FluidContainerModel.java]:::ext
  N62[client/model/ModelProperties.java]:::ext
  N63[model/block/FluidTextureModel.java]:::ext
  N64[model/block/TankModel.java]:::ext
  N65[model/tools/ToolModel.java]:::ext
  N66[data/recipe/ICastCreationHelper.java]:::ext
  N67[data/recipe/ISmelteryRecipeHelper.java]:::ext
  N68[data/recipe/SmelteryRecipeBuilder.java]:::ext
  N69[library/fluid/EmptyFluidHandlerItem.java]:::ext
  N70[library/fluid/FillOnlyFluidHandler.java]:::ext
  N71[library/fluid/FluidTankAnimated.java]:::ext
  N72[library/fluid/FluidTankBase.java]:::ext
  N73[library/fluid/GTConstructFluid.java]:::ext
  N74[library/materials/MaterialRegistry.java]:::ext
  N75[materials/definition/IMaterial.java]:::ext
  N76[modifiers/fluid/FluidEffectContext.java]:::ext
  N77[modifiers/fluid/FluidEffectManager.java]:::ext
  N78[library/recipe/FluidValues.java]:::ext
  N79[library/recipe/TinkerRecipeTypes.java]:::ext
  N80[recipe/alloying/AlloyRecipe.java]:::ext
  N81[recipe/alloying/AlloyRecipeBuilder.java]:::ext
  N82[recipe/casting/CastDuplicationRecipe.java]:::ext
  N83[recipe/casting/ICastingRecipe.java]:::ext
  N84[recipe/casting/ItemCastingRecipe.java]:::ext
  N85[recipe/casting/ItemCastingRecipeBuilder.java]:::ext
  N86[recipe/casting/PotionCastingRecipe.java]:::ext
  N87[recipe/casting/PotionCastingRecipeBuilder.java]:::ext
  N88[recipe/casting/RetexturedCastingRecipe.java]:::ext
  N89[recipe/casting/TipClearingCastingRecipe.java]:::ext
  N90[recipe/casting/TippingCastingRecipe.java]:::ext
  N91[casting/container/ContainerFillingRecipe.java]:::ext
  N92[casting/container/ContainerFillingRecipeBuilder.java]:::ext
  N93[casting/material/CompositeCastingRecipe.java]:::ext
  N94[casting/material/CompositeCastingRecipeBuilder.java]:::ext
  N95[casting/material/MaterialCastingRecipe.java]:::ext
  N96[casting/material/MaterialCastingRecipeBuilder.java]:::ext
  N97[casting/material/MaterialFluidRecipe.java]:::ext
  N98[casting/material/PartSwapCastingRecipe.java]:::ext
  N99[casting/material/PartSwapCastingRecipeBuilder.java]:::ext
  N100[casting/material/ToolCastingRecipe.java]:::ext
  N101[recipe/entitymelting/EntityMeltingRecipe.java]:::ext
  N102[recipe/entitymelting/EntityMeltingRecipeBuilder.java]:::ext
  N103[recipe/entitymelting/EntityMeltingRecipeCache.java]:::ext
  N104[recipe/fuel/MeltingFuel.java]:::ext
  N105[recipe/fuel/MeltingFuelBuilder.java]:::ext
  N106[recipe/fuel/MeltingFuelLookup.java]:::ext
  N107[recipe/gtceu/GTConstructRecipeType.java]:::ext
  N108[recipe/gtceu/GTConstructRecipes.java]:::ext
  N109[recipe/ingredient/BlockTagIngredient.java]:::ext
  N110[recipe/ingredient/MaterialIngredient.java]:::ext
  N111[recipe/ingredient/NoContainerIngredient.java]:::ext
  N112[recipe/melting/DamageableMeltingRecipe.java]:::ext
  N113[recipe/melting/IMeltingRecipe.java]:::ext
  N114[recipe/melting/MaterialMeltingRecipe.java]:::ext
  N115[recipe/melting/MeltingRecipe.java]:::ext
  N116[recipe/melting/MeltingRecipeBuilder.java]:::ext
  N117[recipe/melting/OreMeltingRecipe.java]:::ext
  N118[recipe/molding/MoldingRecipe.java]:::ext
  N119[recipe/molding/MoldingRecipeBuilder.java]:::ext
  N120[partbuilder/recycle/PartBuilderRecycleBuilder.java]:::ext
  N121[partbuilder/recycle/PartBuilderToolRecycleBuilder.java]:::ext
  N122[capability/fluid/TankModule.java]:::ext
  N123[tools/part/PartCastItem.java]:::ext
  N124[library/utils/NBTTags.java]:::ext
  N125[library/utils/TagUtil.java]:::ext
  N126[library/utils/Util.java]:::ext
  N127[plugin/jei/AlloyRecipeCategory.java]:::ext
  N128[plugin/jei/JEIPlugin.java]:::ext
  N129[plugin/jei/MoldingRecipeCategory.java]:::ext
  N130[jei/casting/CastingBasinCategory.java]:::ext
  N131[jei/casting/CastingTableCategory.java]:::ext
  N132[jei/entity/DefaultEntityMeltingRecipe.java]:::ext
  N133[jei/melting/FoundryCategory.java]:::ext
  N134[jei/melting/MeltingCategory.java]:::ext
  N135[jei/util/GuiContainerTankHandler.java]:::ext
  N136[tconstruct/shared/TinkerCommons.java]:::ext
  N137[tconstruct/shared/TinkerEffects.java]:::ext
  N138[tconstruct/shared/TinkerFood.java]:::ext
  N139[tconstruct/shared/TinkerMaterials.java]:::ext
  N140[shared/block/ClearGlassPaneBlock.java]:::ext
  N141[shared/block/PlaceBlockDispenserBehavior.java]:::ext
  N142[shared/block/SlimeType.java]:::ext
  N143[shared/block/SoulGlassPaneBlock.java]:::ext
  N144[command/subcommand/GenerateHiddenFluidsCommand.java]:::ext
  N145[shared/data/CommonRecipeProvider.java]:::ext
  N146[shared/particle/FluidParticleData.java]:::ext
  N147[tconstruct/smeltery/SmelteryClientEvents.java]:::core
  N148[tconstruct/smeltery/TinkerSmeltery.java]:::core
  N149[smeltery/block/AbstractCastingBlock.java]:::core
  N150[smeltery/block/CastingBasinBlock.java]:::core
  N151[smeltery/block/CastingTableBlock.java]:::core
  N152[smeltery/block/CastingTankBlock.java]:::core
  N153[smeltery/block/ChannelBlock.java]:::core
  N154[smeltery/block/FaucetBlock.java]:::core
  N155[smeltery/block/FluidCannonBlock.java]:::core
  N156[smeltery/block/ProxyTankBlock.java]:::core
  N157[smeltery/block/RenderingGaugeBlock.java]:::core
  N158[smeltery/block/SearedLanternBlock.java]:::core
  N159[block/component/OrientableSmelteryBlock.java]:::core
  N160[block/component/RetexturedOrientableSmelteryBlock.java]:::core
  N161[block/component/SearedBlock.java]:::core
  N162[block/component/SearedDrainBlock.java]:::core
  N163[block/component/SearedDuctBlock.java]:::core
  N164[block/component/SearedGlassBlock.java]:::core
  N165[block/component/SearedLadderBlock.java]:::core
  N166[block/component/SearedPillarBlock.java]:::core
  N167[block/component/SearedSlabBlock.java]:::core
  N168[block/component/SearedSoulGlassBlock.java]:::core
  N169[block/component/SearedStairsBlock.java]:::core
  N170[block/component/SearedTankBlock.java]:::core
  N171[block/component/SearedTintedGlassBlock.java]:::core
  N172[block/component/package-info.java]:::core
  N173[block/controller/AlloyerBlock.java]:::core
  N174[block/controller/ControllerBlock.java]:::core
  N175[block/controller/FoundryControllerBlock.java]:::core
  N176[block/controller/HeaterBlock.java]:::core
  N177[block/controller/HeatingControllerBlock.java]:::core
  N178[block/controller/MelterBlock.java]:::core
  N179[block/controller/SmelteryControllerBlock.java]:::core
  N180[block/controller/TinyMultiblockControllerBlock.java]:::core
  N181[block/controller/package-info.java]:::core
  N182[block/entity/CastingBlockEntity.java]:::core
  N183[block/entity/CastingTankBlockEntity.java]:::core
  N184[block/entity/ChannelBlockEntity.java]:::core
  N185[block/entity/FaucetBlockEntity.java]:::core
  N186[block/entity/FluidCannonBlockEntity.java]:::core
  N187[block/entity/GaugeBlockEntity.java]:::core
  N188[block/entity/HeaterBlockEntity.java]:::core
  N189[block/entity/ITankBlockEntity.java]:::core
  N190[block/entity/LanternBlockEntity.java]:::core
  N191[block/entity/ProxyTankBlockEntity.java]:::core
  N192[entity/component/DrainBlockEntity.java]:::core
  N193[entity/component/DuctBlockEntity.java]:::core
  N194[entity/component/SmelteryComponentBlockEntity.java]:::core
  N195[entity/component/SmelteryInputOutputBlockEntity.java]:::core
  N196[entity/component/TankBlockEntity.java]:::core
  N197[entity/component/package-info.java]:::core
  N198[entity/controller/AlloyerBlockEntity.java]:::core
  N199[entity/controller/FoundryBlockEntity.java]:::core
  N200[entity/controller/HeatingStructureBlockEntity.java]:::core
  N201[entity/controller/MelterBlockEntity.java]:::core
  N202[entity/controller/SmelteryBlockEntity.java]:::core
  N203[entity/controller/package-info.java]:::core
  N204[entity/inventory/CastingContainerWrapper.java]:::core
  N205[entity/inventory/DuctItemHandler.java]:::core
  N206[entity/inventory/DuctTankWrapper.java]:::core
  N207[entity/inventory/HeaterItemHandler.java]:::core
  N208[entity/inventory/MelterFuelWrapper.java]:::core
  N209[entity/inventory/MoldingContainerWrapper.java]:::core
  N210[entity/inventory/package-info.java]:::core
  N211[entity/module/ByproductMeltingModuleInventory.java]:::core
  N212[entity/module/EntityMeltingModule.java]:::core
  N213[entity/module/FuelModule.java]:::core
  N214[entity/module/MeltingModule.java]:::core
  N215[entity/module/MeltingModuleInventory.java]:::core
  N216[entity/module/MultitankFuelModule.java]:::core
  N217[entity/module/SolidFuelModule.java]:::core
  N218[module/alloying/IAlloyingModule.java]:::core
  N219[module/alloying/MixerAlloyTank.java]:::core
  N220[module/alloying/MultiAlloyingModule.java]:::core
  N221[module/alloying/SingleAlloyingModule.java]:::core
  N222[module/alloying/SmelteryAlloyTank.java]:::core
  N223[module/alloying/package-info.java]:::core
  N224[entity/module/package-info.java]:::core
  N225[entity/multiblock/FoundryMultiblock.java]:::core
  N226[entity/multiblock/HeatingStructureMultiblock.java]:::core
  N227[entity/multiblock/MultiblockCuboid.java]:::core
  N228[entity/multiblock/MultiblockResult.java]:::core
  N229[entity/multiblock/MultiblockStructureData.java]:::core
  N230[entity/multiblock/SmelteryMultiblock.java]:::core
  N231[entity/multiblock/package-info.java]:::core
  N232[block/entity/package-info.java]:::core
  N233[entity/tank/CastingFluidHandler.java]:::core
  N234[entity/tank/ChannelSideTank.java]:::core
  N235[entity/tank/ChannelTank.java]:::core
  N236[entity/tank/IDisplayFluidListener.java]:::core
  N237[entity/tank/ISmelteryTankHandler.java]:::core
  N238[entity/tank/ProxyItemTank.java]:::core
  N239[entity/tank/SmelteryTank.java]:::core
  N240[entity/tank/package-info.java]:::core
  N241[smeltery/block/package-info.java]:::core
  N242[smeltery/client/package-info.java]:::core
  N243[client/render/CastingBlockEntityRenderer.java]:::core
  N244[client/render/ChannelBlockEntityRenderer.java]:::core
  N245[client/render/FaucetBlockEntityRenderer.java]:::core
  N246[client/render/GaugeBlockEntityRenderer.java]:::core
  N247[client/render/HeatingStructureBlockEntityRenderer.java]:::core
  N248[client/render/ProxyTankBlockEntityRenderer.java]:::core
  N249[client/render/SmelteryTankRenderer.java]:::core
  N250[client/render/TankBlockEntityRenderer.java]:::core
  N251[client/render/TankInventoryBlockEntityRenderer.java]:::core
  N252[client/render/package-info.java]:::core
  N253[client/screen/AlloyerScreen.java]:::core
  N254[client/screen/HeatingStructureScreen.java]:::core
  N255[client/screen/IScreenWithFluidTank.java]:::core
  N256[client/screen/MelterScreen.java]:::core
  N257[client/screen/SingleItemScreenFactory.java]:::core
  N258[screen/module/ClickableTankModule.java]:::core
  N259[screen/module/GuiFuelModule.java]:::core
  N260[screen/module/GuiMeltingModule.java]:::core
  N261[screen/module/GuiSmelteryTank.java]:::core
  N262[screen/module/GuiTankModule.java]:::core
  N263[screen/module/HeatingStructureSideInventoryScreen.java]:::core
  N264[screen/module/package-info.java]:::core
  N265[client/screen/package-info.java]:::core
  N266[client/util/CastingItemRenderTypeBuffer.java]:::core
  N267[client/util/TintedVertexBuilder.java]:::core
  N268[client/util/package-info.java]:::core
  N269[smeltery/data/Byproduct.java]:::core
  N270[smeltery/data/FluidContainerTransferProvider.java]:::core
  N271[smeltery/data/SmelteryCompat.java]:::core
  N272[smeltery/data/SmelteryRecipeProvider.java]:::core
  N273[smeltery/data/package-info.java]:::core
  N274[smeltery/item/CopperCanFluidHandler.java]:::core
  N275[smeltery/item/CopperCanItem.java]:::core
  N276[smeltery/item/DummyMaterialItem.java]:::core
  N277[smeltery/item/ScaledFluidTank.java]:::core
  N278[smeltery/item/TankItem.java]:::core
  N279[smeltery/item/TankItemFluidHandler.java]:::core
  N280[smeltery/item/package-info.java]:::core
  N281[smeltery/menu/AlloyerContainerMenu.java]:::core
  N282[smeltery/menu/HeatingStructureContainerMenu.java]:::core
  N283[smeltery/menu/MelterContainerMenu.java]:::core
  N284[smeltery/menu/SingleItemContainerMenu.java]:::core
  N285[smeltery/menu/TransferDirectionSupplier.java]:::core
  N286[smeltery/menu/package-info.java]:::core
  N287[smeltery/network/ChannelFlowPacket.java]:::core
  N288[smeltery/network/FaucetActivationPacket.java]:::core
  N289[smeltery/network/FluidUpdatePacket.java]:::core
  N290[smeltery/network/SmelteryFluidClickedPacket.java]:::core
  N291[smeltery/network/SmelteryTankUpdatePacket.java]:::core
  N292[smeltery/network/StructureErrorPositionPacket.java]:::core
  N293[smeltery/network/StructureUpdatePacket.java]:::core
  N294[smeltery/network/package-info.java]:::core
  N295[tconstruct/smeltery/package-info.java]:::core
  N296[tables/data/TableRecipeProvider.java]:::ext
  N297[tconstruct/tools/TinkerModifiers.java]:::ext
  N298[tconstruct/tools/TinkerToolParts.java]:::ext
  N299[tools/client/ToolContainerScreen.java]:::ext
  N300[tools/data/FluidEffectProvider.java]:::ext
  N301[tools/data/ModifierRecipeProvider.java]:::ext
  N302[tools/data/ToolsRecipeProvider.java]:::ext
  N303[data/material/MaterialIds.java]:::ext
  N304[data/material/MaterialRecipeProvider.java]:::ext
  N305[tools/entity/FluidEffectProjectile.java]:::ext
  N306[tools/modules/MeltingModule.java]:::ext
  N307[tools/network/FluidDataSerializer.java]:::ext
  N308[tconstruct/world/TinkerHeadType.java]:::ext
  N309[tconstruct/world/TinkerWorld.java]:::ext
  N310[world/block/FoliageType.java]:::ext
  N311[world/data/StructureRepalleter.java]:::ext
  N0 --> N27
  N0 --> N148
  N5 --> N27
  N5 --> N148
  N5 --> N170
  N5 --> N278
  N6 --> N148
  N7 --> N148
  N8 --> N148
  N9 --> N271
  N10 --> N27
  N10 --> N148
  N11 --> N148
  N12 --> N148
  N13 --> N148
  N13 --> N154
  N14 --> N148
  N15 --> N148
  N16 --> N27
  N16 --> N148
  N16 --> N271
  N17 --> N27
  N18 --> N27
  N18 --> N148
  N19 --> N148
  N23 --> N287
  N23 --> N288
  N23 --> N289
  N23 --> N290
  N23 --> N291
  N23 --> N292
  N23 --> N293
  N25 --> N0
  N25 --> N27
  N25 --> N61
  N26 --> N0
  N26 --> N27
  N26 --> N47
  N27 --> N0
  N27 --> N3
  N27 --> N28
  N27 --> N29
  N27 --> N31
  N27 --> N32
  N27 --> N33
  N27 --> N34
  N27 --> N36
  N27 --> N37
  N27 --> N39
  N27 --> N40
  N27 --> N42
  N27 --> N43
  N27 --> N46
  N27 --> N48
  N27 --> N49
  N27 --> N50
  N27 --> N78
  N27 --> N137
  N27 --> N138
  N27 --> N142
  N27 --> N148
  N27 --> N275
  N27 --> N278
  N27 --> N303
  N27 --> N307
  N27 --> N309
  N33 --> N0
  N33 --> N27
  N34 --> N0
  N34 --> N78
  N34 --> N148
  N34 --> N281
  N34 --> N283
  N36 --> N27
  N40 --> N47
  N41 --> N0
  N42 --> N27
  N42 --> N47
  N42 --> N78
  N43 --> N126
  N53 --> N40
  N54 --> N27
  N60 --> N148
  N60 --> N275
  N64 --> N278
  N66 --> N27
  N67 --> N148
  N68 --> N148
  N72 --> N289
  N73 --> N27
  N80 --> N148
  N83 --> N148
  N85 --> N148
  N87 --> N148
  N92 --> N148
  N94 --> N148
  N96 --> N148
  N97 --> N148
  N99 --> N148
  N101 --> N148
  N104 --> N148
  N107 --> N148
  N108 --> N27
  N112 --> N148
  N113 --> N148
  N114 --> N148
  N115 --> N148
  N117 --> N148
  N119 --> N148
  N120 --> N27
  N121 --> N27
  N122 --> N278
  N127 --> N148
  N128 --> N27
  N128 --> N36
  N128 --> N148
  N128 --> N253
  N128 --> N254
  N128 --> N256
  N128 --> N271
  N128 --> N275
  N128 --> N278
  N129 --> N148
  N130 --> N148
  N131 --> N148
  N132 --> N212
  N133 --> N148
  N134 --> N148
  N135 --> N255
  N144 --> N271
  N145 --> N27
  N145 --> N148
  N147 --> N0
  N147 --> N55
  N147 --> N63
  N147 --> N64
  N147 --> N65
  N147 --> N148
  N147 --> N243
  N147 --> N244
  N147 --> N245
  N147 --> N246
  N147 --> N247
  N147 --> N248
  N147 --> N250
  N147 --> N251
  N147 --> N253
  N147 --> N254
  N147 --> N256
  N147 --> N257
  N148 --> N0
  N148 --> N3
  N148 --> N27
  N148 --> N41
  N148 --> N78
  N148 --> N79
  N148 --> N80
  N148 --> N82
  N148 --> N84
  N148 --> N86
  N148 --> N88
  N148 --> N89
  N148 --> N90
  N148 --> N91
  N148 --> N93
  N148 --> N95
  N148 --> N97
  N148 --> N98
  N148 --> N100
  N148 --> N101
  N148 --> N104
  N148 --> N112
  N148 --> N114
  N148 --> N115
  N148 --> N117
  N148 --> N118
  N148 --> N123
  N148 --> N136
  N148 --> N140
  N148 --> N141
  N148 --> N143
  N148 --> N150
  N148 --> N151
  N148 --> N152
  N148 --> N153
  N148 --> N154
  N148 --> N155
  N148 --> N156
  N148 --> N157
  N148 --> N158
  N148 --> N160
  N148 --> N161
  N148 --> N162
  N148 --> N163
  N148 --> N164
  N148 --> N165
  N148 --> N166
  N148 --> N168
  N148 --> N170
  N148 --> N171
  N148 --> N173
  N148 --> N174
  N148 --> N175
  N148 --> N176
  N148 --> N178
  N148 --> N179
  N148 --> N182
  N148 --> N183
  N148 --> N184
  N148 --> N185
  N148 --> N186
  N148 --> N187
  N148 --> N188
  N148 --> N190
  N148 --> N191
  N148 --> N192
  N148 --> N193
  N148 --> N194
  N148 --> N195
  N148 --> N196
  N148 --> N198
  N148 --> N199
  N148 --> N201
  N148 --> N202
  N148 --> N270
  N148 --> N272
  N148 --> N275
  N148 --> N276
  N148 --> N278
  N148 --> N281
  N148 --> N282
  N148 --> N283
  N148 --> N284
  N148 --> N298
  N149 --> N182
  N150 --> N148
  N150 --> N149
  N150 --> N182
  N151 --> N148
  N151 --> N149
  N151 --> N182
  N152 --> N124
  N152 --> N170
  N152 --> N183
  N152 --> N189
  N152 --> N196
  N153 --> N0
  N153 --> N126
  N153 --> N148
  N153 --> N184
  N154 --> N148
  N154 --> N185
  N155 --> N170
  N155 --> N186
  N156 --> N191
  N157 --> N187
  N158 --> N124
  N158 --> N170
  N158 --> N189
  N158 --> N190
  N158 --> N196
  N159 --> N161
  N160 --> N159
  N161 --> N194
  N162 --> N160
  N163 --> N161
  N163 --> N193
  N163 --> N194
  N164 --> N161
  N165 --> N159
  N166 --> N161
  N167 --> N194
  N168 --> N164
  N169 --> N194
  N170 --> N78
  N170 --> N124
  N170 --> N161
  N170 --> N189
  N170 --> N196
  N170 --> N278
  N171 --> N164
  N173 --> N126
  N173 --> N148
  N173 --> N180
  N173 --> N198
  N174 --> N161
  N175 --> N148
  N175 --> N177
  N175 --> N199
  N175 --> N200
  N176 --> N3
  N176 --> N174
  N176 --> N188
  N177 --> N23
  N177 --> N174
  N177 --> N200
  N177 --> N292
  N178 --> N148
  N178 --> N180
  N178 --> N201
  N179 --> N148
  N179 --> N177
  N179 --> N200
  N179 --> N202
  N180 --> N0
  N180 --> N3
  N180 --> N174
  N180 --> N189
  N182 --> N0
  N182 --> N1
  N182 --> N3
  N182 --> N23
  N182 --> N79
  N182 --> N83
  N182 --> N148
  N182 --> N149
  N182 --> N204
  N182 --> N209
  N182 --> N233
  N182 --> N289
  N183 --> N0
  N183 --> N1
  N183 --> N62
  N183 --> N71
  N183 --> N124
  N183 --> N148
  N183 --> N152
  N183 --> N189
  N183 --> N196
  N183 --> N278
  N184 --> N23
  N184 --> N70
  N184 --> N148
  N184 --> N153
  N184 --> N185
  N184 --> N234
  N184 --> N235
  N184 --> N287
  N184 --> N289
  N185 --> N23
  N185 --> N78
  N185 --> N148
  N185 --> N288
  N186 --> N22
  N186 --> N23
  N186 --> N76
  N186 --> N77
  N186 --> N124
  N186 --> N126
  N186 --> N136
  N186 --> N146
  N186 --> N148
  N186 --> N189
  N186 --> N196
  N186 --> N305
  N187 --> N148
  N188 --> N0
  N188 --> N148
  N188 --> N207
  N188 --> N284
  N189 --> N4
  N189 --> N58
  N189 --> N289
  N190 --> N148
  N190 --> N196
  N191 --> N148
  N191 --> N238
  N192 --> N62
  N192 --> N148
  N192 --> N195
  N193 --> N0
  N193 --> N62
  N193 --> N148
  N193 --> N195
  N193 --> N205
  N193 --> N206
  N193 --> N284
  N194 --> N148
  N195 --> N148
  N195 --> N194
  N196 --> N62
  N196 --> N71
  N196 --> N124
  N196 --> N148
  N196 --> N170
  N196 --> N189
  N196 --> N194
  N196 --> N278
  N198 --> N0
  N198 --> N3
  N198 --> N71
  N198 --> N124
  N198 --> N148
  N198 --> N174
  N198 --> N178
  N198 --> N217
  N198 --> N219
  N198 --> N221
  N198 --> N281
  N199 --> N0
  N199 --> N4
  N199 --> N78
  N199 --> N148
  N199 --> N174
  N199 --> N200
  N199 --> N211
  N199 --> N225
  N199 --> N226
  N200 --> N23
  N200 --> N62
  N200 --> N174
  N200 --> N179
  N200 --> N212
  N200 --> N216
  N200 --> N226
  N200 --> N282
  N200 --> N292
  N200 --> N293
  N201 --> N0
  N201 --> N3
  N201 --> N4
  N201 --> N62
  N201 --> N71
  N201 --> N78
  N201 --> N124
  N201 --> N148
  N201 --> N174
  N201 --> N178
  N201 --> N215
  N201 --> N217
  N201 --> N283
  N202 --> N0
  N202 --> N4
  N202 --> N78
  N202 --> N148
  N202 --> N174
  N202 --> N200
  N202 --> N215
  N202 --> N220
  N202 --> N222
  N202 --> N226
  N202 --> N230
  N204 --> N182
  N205 --> N3
  N205 --> N22
  N205 --> N23
  N206 --> N205
  N207 --> N79
  N211 --> N215
  N212 --> N2
  N212 --> N27
  N212 --> N78
  N212 --> N103
  N213 --> N0
  N213 --> N106
  N213 --> N126
  N214 --> N22
  N214 --> N23
  N214 --> N79
  N216 --> N126
  N216 --> N213
  N217 --> N0
  N217 --> N79
  N217 --> N106
  N217 --> N126
  N217 --> N213
  N219 --> N3
  N220 --> N79
  N220 --> N218
  N221 --> N79
  N221 --> N218
  N225 --> N3
  N225 --> N226
  N226 --> N161
  N226 --> N227
  N226 --> N228
  N226 --> N229
  N227 --> N0
  N227 --> N3
  N227 --> N125
  N227 --> N228
  N227 --> N229
  N229 --> N21
  N229 --> N161
  N230 --> N3
  N230 --> N226
  N234 --> N235
  N237 --> N239
  N238 --> N3
  N238 --> N22
  N238 --> N23
  N238 --> N69
  N239 --> N23
  N239 --> N237
  N239 --> N291
  N243 --> N57
  N243 --> N266
  N244 --> N153
  N245 --> N154
  N247 --> N4
  N247 --> N55
  N247 --> N59
  N247 --> N174
  N247 --> N249
  N248 --> N4
  N248 --> N251
  N249 --> N59
  N249 --> N261
  N250 --> N4
  N250 --> N57
  N251 --> N4
  N251 --> N57
  N253 --> N0
  N253 --> N56
  N253 --> N255
  N253 --> N259
  N253 --> N262
  N253 --> N281
  N254 --> N0
  N254 --> N56
  N254 --> N174
  N254 --> N255
  N254 --> N259
  N254 --> N260
  N254 --> N261
  N254 --> N263
  N254 --> N282
  N256 --> N0
  N256 --> N56
  N256 --> N255
  N256 --> N259
  N256 --> N260
  N256 --> N262
  N256 --> N283
  N257 --> N0
  N259 --> N0
  N259 --> N56
  N259 --> N213
  N259 --> N258
  N260 --> N0
  N260 --> N56
  N261 --> N0
  N261 --> N23
  N261 --> N56
  N261 --> N290
  N262 --> N56
  N262 --> N258
  N262 --> N261
  N263 --> N254
  N266 --> N267
  N269 --> N27
  N269 --> N78
  N270 --> N0
  N270 --> N27
  N270 --> N78
  N270 --> N142
  N271 --> N27
  N271 --> N74
  N271 --> N75
  N271 --> N303
  N272 --> N0
  N272 --> N3
  N272 --> N20
  N272 --> N24
  N272 --> N27
  N272 --> N36
  N272 --> N52
  N272 --> N67
  N272 --> N68
  N272 --> N78
  N272 --> N81
  N272 --> N85
  N272 --> N87
  N272 --> N92
  N272 --> N102
  N272 --> N105
  N272 --> N109
  N272 --> N110
  N272 --> N111
  N272 --> N113
  N272 --> N116
  N272 --> N119
  N272 --> N136
  N272 --> N139
  N272 --> N142
  N272 --> N148
  N272 --> N269
  N272 --> N297
  N272 --> N298
  N272 --> N303
  N272 --> N308
  N272 --> N309
  N272 --> N310
  N274 --> N78
  N274 --> N275
  N275 --> N3
  N275 --> N78
  N275 --> N148
  N275 --> N274
  N275 --> N278
  N276 --> N0
  N278 --> N0
  N278 --> N3
  N278 --> N78
  N278 --> N124
  N278 --> N148
  N278 --> N196
  N278 --> N277
  N278 --> N279
  N279 --> N196
  N279 --> N278
  N281 --> N0
  N281 --> N3
  N281 --> N148
  N281 --> N198
  N282 --> N148
  N282 --> N200
  N282 --> N285
  N283 --> N0
  N283 --> N3
  N283 --> N148
  N283 --> N201
  N284 --> N148
  N287 --> N184
  N288 --> N289
  N291 --> N237
  N292 --> N200
  N293 --> N200
  N296 --> N27
  N296 --> N148
  N298 --> N148
  N299 --> N262
  N300 --> N27
  N300 --> N148
  N301 --> N27
  N301 --> N148
  N302 --> N27
  N302 --> N148
  N304 --> N27
  N304 --> N148
  N305 --> N27
  N306 --> N212
  N309 --> N27
  N311 --> N27
  classDef core fill:#e8f5e9,stroke:#2e7d32,color:#1b5e20;
  classDef ext fill:#fff3e0,stroke:#ef6c00,color:#e65100;
```