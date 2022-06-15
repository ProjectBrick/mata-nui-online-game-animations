.flash
	filename="matanuionlinegameanimations.swf"
	version=5
	fps=18
	bbox=770x425
	background=#000000

	.font TradeMarkerLight "fonts/trademarker_light.ttf"

	.text menu_title font=TradeMarkerLight size=30pt color=#B99359 text="Mata Nui Online Game Animations"
	.text button_fps_18_text font=TradeMarkerLight size=24pt color=#FF9900 text="18 FPS: Original"
	.text button_fps_30_text font=TradeMarkerLight size=24pt color=#FF9900 text="30 FPS: Faster"

	.box button_shape width=300 height=58 line=3 color=#999999 fill=#333333

	.sprite button_fps_18_idle
		.put button_shape pin=center
		.put button_fps_18_text pin=center y=2
	.end

	.sprite button_fps_30_idle
		.put button_shape pin=center
		.put button_fps_30_text pin=center y=2
	.end

	.button button_fps_18
		.show button_shape pin=center as=area
		.show button_fps_18_idle as=idle,hover,pressed
		.on_release:
			loadMovie("player.swf", "_level0");
		.end
	.end

	.button button_fps_30
		.show button_shape pin=center as=area
		.show button_fps_30_idle as=idle,hover,pressed
		.on_release:
			loadMovie("player-30fps.swf", "_level0");
		.end
	.end

	.put menu_title pin=center x=385 y=100
	.put button_fps_18 x=385 y=220
	.put button_fps_30 x=385 y=300
.end
