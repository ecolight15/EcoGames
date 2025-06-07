package jp.minecraftuser.ecogames.listener;

import jp.minecraftuser.ecoframework.PluginFrame;
import jp.minecraftuser.ecoframework.ListenerFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * プレイヤー接続切断イベント処理リスナークラス
 * @author ecolight
 */
public class PlayerConnectionListener extends ListenerFrame {

    /**
     * コンストラクタ
     * @param plg_ プラグインインスタンス
     * @param name_ 名前
     */
    public PlayerConnectionListener(PluginFrame plg_, String name_) {
        super(plg_, name_);
    }

    /**
     * プレイヤー終了イベントハンドラ
     * @param e イベント
     */
    @EventHandler(priority=EventPriority.LOWEST)
    public void PlayerQuit(PlayerQuitEvent e) {
        // TODO: プレイヤー終了時の処理を実装する
    }

    /**
     * プレイヤーKICKイベント処理
     * @param e イベント情報
     */
    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerKick(PlayerKickEvent e) {
        // TODO: プレイヤーキック時の処理を実装する
    }

    /**
     * プレイヤーログインイベントハンドラ
     * @param e イベント情報
     */
    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerLogin(PlayerLoginEvent e) {
        // TODO: プレイヤーログイン時の処理を実装する
    }

    /**
     * プレイヤーサーバー参加イベントハンドラ
     * @param e 
     */
    @EventHandler(priority=EventPriority.LOWEST)
    public void PlayerJoin(PlayerJoinEvent e) {
        // TODO: プレイヤー参加時の処理を実装する
    }

}