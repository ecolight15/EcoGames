package jp.minecraftuser.ecogames;

import jp.minecraftuser.ecogames.command.*;
import jp.minecraftuser.ecoframework.PluginFrame;
import jp.minecraftuser.ecoframework.CommandFrame;
import jp.minecraftuser.ecoframework.ConfigFrame;
import jp.minecraftuser.ecogames.config.EcoGamesConfig;
import jp.minecraftuser.ecogames.listener.PlayerConnectionListener;

/**
 * EcoGamesプラグインメインクラス
 * @author ecolight
 */
public class EcoGames extends PluginFrame {

    /**
     * プラグイン開始処理
     */
    @Override
    public void onEnable() {
        initialize();
    }

    /**
     * プラグイン終了処理
     */
    @Override
    public void onDisable()
    {
        disable();
    }

    /**
     * 設定ファイル処理の初期化と登録
     */
    @Override
    public void initializeConfig() {
        ConfigFrame conf;

        // デフォルトコンフィグ
        conf = new EcoGamesConfig(this);

        // 基本設定項目
        conf.registerBoolean("game.settings.enabled");
        conf.registerBoolean("game.settings.debug");

        registerPluginConfig(conf);
    }

    /**
     * コマンド処理の初期化と登録
     */
    @Override
    public void initializeCommand() {
        CommandFrame cmd = new GameCommand(this, "game");
        cmd.addCommand(new GameReloadCommand(this, "reload"));
        registerPluginCommand(cmd);
    }

    /**
     * イベントリスナー処理の初期化と登録
     */
    @Override
    public void initializeListener() {
        registerPluginListener(new PlayerConnectionListener(this, "plconnection"));
    }

    /**
     * タイマー処理の初期化と登録
     */
    @Override
    public void initializeTimer() {
        // TODO: タイマー処理を実装する場合はここに追加
    }

}