# Conquer the Dungeon
This is a game made using the Greenfoot engine for ICS4U, developed by
* Freeman Wang *(tilemap system, pathfinding, room design)*
* Tony Lin *(animation, art)*
* Osmond Lin *(enemy AI)*
* Ivan Xie *(Music & sound)*
* Neelan Thurairajah *(UI & tile behaviour)*

## Getting the Game
To play this, you would need to [install Greenfoot](https://www.greenfoot.org/download) through the given link. It doesn't matter how you installed it, as long as it's there.\
You know, the standard procedure like any other software.

Next, you have to clone this repo (or get its source code).

I guess you can go to your terminal, navigate somewhere where you want to clone to, and run
```bash
git clone https://www.github.com/kingmclol/SoulKnightsICS4U.git
```
and probably, it would work. If I didn't make a typo there.

Or, you can use the green button that says `<>Code` at the top-right and just take a zip file of the code and extract it somewhere.

Anyway, once you've got the code, you can run Greenfoot and open the SoulKnightsICS4U folder from there, and you should be able to play now.

## Introduction
In this game, you play as a lucky person who is reincarnated into a world that is solely dedicated to fighting in a never-ending dungeon. Don't think about why you were placed specifically in this world, otherwise you'll get sniped by a nearby skeleton.

Descend lower and lower, clearing increasingly difficult rooms while getting slightly stronger along the way.

Perhaps there is a way to escape this never-ending hell. No one knows, so all you can do is keep moving forward. ~~There is no escape.~~

*"Why do I keep getting reincarnated here? What was my original life? I can't remember... Must keep going... Kill or be killed..."*

How far can you get before you need to be reincarnated once again?

## Instructions
- `WASD` movement.
- `Left click` to attack.
- `R` to switch weapon.
- `SHIFT` to dash.
- `Q` to use ultimate.
- `E` or `Left click` to buy an item in a shop
- `Mouse hover` over an item in a shop to see its info.

### Tips
- Keep your HP above zero while making your enemies' HP zero.
- Break barrels and use the environment to your advantage.
- Don't instantly leave to the next level. Break all barrels and collect coins first.
- Save scumming is very easy, as the save is never deleted unless you decide to do so. Use this to get better items in shops or to restart a bad run.

## Features
- **Randomized rooms:** A pool of predetermined rooms to play in, picked randomly.
- **Shop and upgrades:** Use coins obtained throughout the game to make yourself more powerful. Shops appear every 3 levels.
- **Saving & loading:** Saves the game every time you are in a shop. Good for save scumming.
- **Progressive difficulty:** Enemies and waves increase as you delve deeper.
- **Multiple tile types:** Different interactions between Entities and tiles.
- **Different enemy types:** Melee (zombie, goblin) vs. ranged (skeleton)
- **Thoroughly animated:** Animations for entities are animated for almost every action they take.

## Known Bugs
- When loading from a save file, the health bar for the player does not reflect the actual health of the player. The health bar in the side panel is correct, however.
- ~~When dying while in a sword attack animation, you may be softlocked. Most prominent when killing yourself from an explosive barrel~~.
- Possible bug of shooting staff projectiles in sword form. Unknown cause.
- **SWORD ULTIMATES GOING THROUGH WALLS IS INTENDED.**
- **SOME ENEMIES NOT FOLLOWING YOU IS INTENDED; IF YOU ARE TOO FAR, THEY WILL NOT MOVE TOWARD YOU.**

## Credits
This game was created using some existing assets sourced from others.

### Misc
- SuperSmoothMover, SuperTextBox, SuperStatBar written by Jordan Cohen

### Art & Animation
- See the `Credits` directory for attribution for LPC spritesheets.
- Bullet Image Credits:  Made by Dawson Li in PETHS
- [Arrow Image](https://minecraft-archive.fandom.com/wiki/Arrow?file=Arrow.png)
- [Knight Title Background](https://www.wallpaperflare.com/dungeons-and-dragons-knight-dungeon-and-fighter-minimalism-wallpaper-yvcvv)
- [Dungeon Title Background](https://dmsworkshop.com/2019/05/)
- [Dungeon Door Title Background](https://www.artstation.com/artwork/VdErn4)
- [Speed Stat Icon](https://minecraft.fandom.com/wiki/Speed?file=Speed_JE3_BE2.png)
- [Attack Stat Icon](https://upload.wikimedia.org/wikipedia/commons/d/df/Sword_Pixel_art_-_Radin.png)
- [Health Stat Icon](https://www.deviantart.com/aesthetic-peach-milk/art/Textures-pixel-heart-1-2000x-742492676)
- [Explosion Animation by JROB774](https://opengameart.org/content/pixel-explosion-12-frames)
- [Button PNG Designed By Thi Minh](https://pngtree.com/freepng/buttons-games-button-illustration_6853184.html?sol=downref&id=bef)
- [Title Text](https://www.textstudio.com/logo/word-art-text-graphic-generator-928)
- [Enhanced Sword Slash Effect Art](https://spikerman.itch.io/sword-slashes)
- [Goblin Animation/Graphics](https://opengameart.org/content/lpc-goblin)
- [Heal Animation/Graphics by Serbhii](https://stock.adobe.com/images/heart-pixel-art-animation-isolated-vector-illustration-of-mobile-or-pc-game-sprites-design-for-stickers-logo-mobile-app-game-assets-8-bit-sprite-sheet-contains-flip-appear-disappear/433551947)
- [Regeneration Effect(Yellow)from Picking up Heals, and Power up Drops Graphics (Purple)](https://www.vecteezy.com/vector-art/25442353-8-bit-sparkling-sparkle-star-pixel-art)
- [Coins Animation/Graphics by Nastya Prokopchuk](https://www.istockphoto.com/vector/set-of-8-bit-pixel-graphics-icons-isolated-vector-illustration-game-art-coins-of-gm1787801854-547490383)
- [Portal Graphics and Animation](https://www.cleanpng.com/png-portal-video-game-film-column-sprite-5506003/)
- [Status Effect Animation and Graphics from Power Ups by MyPicts](https://www.deviantart.com/mypicts/art/Aura-412012866)
- Wall and cracked wall images: https://superwalrusland.com/ohr/issue26/pa/pixelart.html
- Barrel image: https://makinggamesinc.itch.io/pixel-art-barrell
- Speedboost and slowtrap images: https://geometry-dash-fan-ideas.fandom.com/wiki/New_Speed_Portals
- Floor and spiketrap images: https://pixelpajamastudios.itch.io/16x16-pixel-art-dungeon-pack
- Landmine image: https://dank-memer.fandom.com/f/t/Landmine
- Lava image: https://www.dreamstime.com/pixel-minecraft-style-fiery-lava-block-background-concept-game-pixelated-seamless-square-orange-yellow-dots-vector-illustration-image274167480

### Sounds & Music
- Lava sound: https://www.youtube.com/watch?v=_pvn1O0H1ok 
- Sword sound: https://www.youtube.com/watch?v=DmDV445zi1Y
- Sword ultimate sound: https://www.youtube.com/watch?v=4bJI-e28kFg
- Powerup sound: https://www.youtube.com/watch?v=M_DoUUEgp3Y
- Spiketrap sound: https://www.youtube.com/watch?v=NnSuTjsNstY
- Fireball sound: https://www.youtube.com/watch?v=V77xa-SDI-I
- Skeleton sound: https://www.youtube.com/watch?v=0EAvnglwF_8
- Zombie sound: https://www.youtube.com/watch?v=C-rJZxBxCIE
- Goblin sound: https://www.youtube.com/watch?v=DYNOArA9JFU
- Landmine and explosive barrel sound: https://www.youtube.com/watch?v=ZuocSHaG7rw
- Speedboost sound: https://www.youtube.com/watch?v=7lvenJGJN5o
- Slowtrap sound: https://www.youtube.com/watch?v=z_epWpdsHJc
- Barrel sound: https://www.youtube.com/watch?v=aW3ildtVwZ4
- Coin sound: https://www.youtube.com/watch?v=88Icb7OKexU
- Destroyable sound: https://www.youtube.com/watch?v=oRwHxQnu-gs
- Dungeon sound: https://www.youtube.com/watch?v=fSrJ2CKq8PY&list=PLD7ixwhyZrDHOHDgm7rnfpqUM6tFswEar&index=21
- Death screen sound: https://www.youtube.com/watch?v=a-X_9DsaHU8
- Intro music: https://www.youtube.com/watch?v=BR9XTjdIppE&list=PLAs1Kha_R9dJtJMZBqpxRnGtDgZM5z6oA
- Story music: https://www.youtube.com/watch?v=SP0RCMtfm4o
