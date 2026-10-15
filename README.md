# Space Invaders — Greenfoot

A Space Invaders-style game built in Java using the [Greenfoot](https://www.greenfoot.org/) framework. Survive waves of enemies across three levels, defeat a boss, and protect your ship with force fields.

## Download and Play

The game runs inside Greenfoot, a free program for Windows, macOS and Linux.

1. **Install Greenfoot** from [greenfoot.org/download](https://www.greenfoot.org/download).
2. **Download the game**: click the green **Code** button at the top of this page, choose **Download ZIP**, then unzip the file. ([Direct ZIP link](https://github.com/foshow23/space-invaders-greenfoot/archive/refs/heads/main.zip))
3. **Open it in Greenfoot**: double-click `project.greenfoot` inside the unzipped folder, or in Greenfoot choose **Scenario → Open** and pick the folder.
4. **Start the game**: click **Run** at the bottom of the Greenfoot window, then press **Enter** on the start screen.

If the start screen doesn't show up, right-click `StartScreen` in the class list on the right and choose `new StartScreen()`.

The project was made in Greenfoot 3.1 and also opens in newer versions.

## Gameplay

- **3 levels** of increasing difficulty, each with a time limit
- **3 enemy types**: standard aliens, UFOs, and a boss alien
- **Power-ups**: force fields and ship upgrades available through a portal between levels
- **Lives system**: represented by hearts; lose them all, and it's Game Over
- **Info & Rules screens** accessible from the start screen

## Controls

| Key | Action |
|-----|--------|
| ← / → Arrow Keys | Move ship left / right |
| ↑ / ↓ Arrow Keys | Move ship up / down |
| Space | Shoot |
| Enter | Start the game from the start screen |
| Mouse click | Use the on-screen buttons (Rules, Info, Retry, Quit, Play Again) |

After clearing Level 1, fly up into the portal at the top of the screen to reach Level 2.

## Project Structure

| File | Description |
|------|-------------|
| `Shooter.java` | Player ship — movement and shooting |
| `Enemy.java` / `Enemy2.java` / `Enemy3.java` | Enemy types |
| `Bullet.java` / `EnemyBullet.java` | Projectiles |
| `Level1–3.java` | Game worlds for each level |
| `ForceField.java` | Defensive shield power-up |
| `Portal.java` | Inter-level upgrade portal |
| `StartScreen.java` | Title/main menu screen |
| `GameOver.java` / `WinScreen.java` | End-game screens |
| `images/` | Game artwork, including the win screen picture `pixelworld.jpg` |
| `sounds/` | Sound effects |

All images and sounds come with the download, so there is nothing extra to add.

