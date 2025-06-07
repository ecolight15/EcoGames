# EcoGames

Minecraft Java版マルチサーバー向けミニゲーム制御機能を詰め込んだ Bukkit(spigot/paper)プラグイン

## ビルド方法 (How to Build)

### 前提条件 (Prerequisites)
- Java 17以上
- Maven 3.6以上
- ネットワーク接続 (Spigot/Paper APIのダウンロードのため)

### 通常のビルド (Normal Build)
実際の開発環境では、以下の手順でビルドしてください：

1. `pom.xml`の依存関係を有効化:
```xml
<repositories>
    <repository>
        <id>spigotmc-repo</id>
        <url>https://hub.spigotmc.org/nexus/content/repositories/snapshots/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>org.spigotmc</groupId>
        <artifactId>spigot-api</artifactId>
        <version>1.20.4-R0.1-SNAPSHOT</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

2. スタブファイルを削除:
   - `src/main/java/org/bukkit/` ディレクトリ
   - `src/main/java/org/jetbrains/` ディレクトリ

3. ビルド実行:
```bash
mvn clean package
```

### 現在の設定について
このリポジトリの現在の設定は、ネットワーク制限のある環境でもコンパイルできるよう、Bukkit APIのスタブが含まれています。実際の開発では上記の手順に従って、本物のSpigot/Paper APIを使用してください。

## 使用方法 (Usage)

1. 生成された `target/EcoGames-1.0.0-SNAPSHOT.jar` を Minecraft サーバーの `plugins` フォルダに配置
2. サーバーを起動またはリロード
3. ゲーム内で `/ecogames` コマンドを使用

## コマンド (Commands)

- `/ecogames` または `/eg` - メイン情報表示
- `/ecogames version` - バージョン表示  
- `/ecogames reload` - プラグイン設定リロード (管理者権限必要)

## 権限 (Permissions)

- `ecogames.admin` - 管理者コマンドへのアクセス (デフォルト: OP)

## 開発者向け (For Developers)

このプラグインは、Bukkit/Spigot/Paper サーバーで動作するミニゲーム制御システムの基盤として設計されています。現在は基本的な構造のみが実装されており、具体的なミニゲーム機能は今後追加予定です。
