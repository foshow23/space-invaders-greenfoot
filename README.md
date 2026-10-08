# Space Invaders — Greenfoot

A Space Invaders-style game built in Java using the [Greenfoot](https://www.greenfoot.org/) framework. Survive waves of enemies across three levels, defeat a boss, and protect your ship with force fields.

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
| Space | Shoot |

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

## Author

Fifunmi Alawiye
