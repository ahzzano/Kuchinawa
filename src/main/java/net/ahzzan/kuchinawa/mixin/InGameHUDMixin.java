package net.ahzzan.kuchinawa.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHUDMixin {

    @Inject(method="render", at= @At("RETURN"))
    public void onRender(MatrixStack matrices, float tickDelta, CallbackInfo info) {
        TextRenderer renderer = MinecraftClient.getInstance().textRenderer;

        MinecraftClient client = MinecraftClient.getInstance();

        // Draw Client
        renderer.draw(matrices, "Kuchinawa v1.0.0", 2f, 2f, 0xffffff);

    }
}
