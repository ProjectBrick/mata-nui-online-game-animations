import fs from 'fs/promises';

import {setFps} from '../../util/swf.mjs';

async function main() {
	const args = process.argv.slice(2);
	if (args.lenght < 3) {
		throw new Error('Args: fps in.swf out.swf');
	}
	const d = await fs.readFile(args[1]);
	setFps(d, +args[0]);
	await fs.writeFile(args[2], d);
}
main().catch(err => {
	process.exitCode = 1;
	console.error(err);
});
