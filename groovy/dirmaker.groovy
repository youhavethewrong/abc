/* Handy script for making a hash-friendly directory structure.
 *
 */

def usage() {
    println "Usage: make-dirs.groovy depth"
    println "depth\t\t2 or 3; the depth of subdirectories you want to create"
}

def create2dStructure(parts) {
    parts.each{ fPart ->
        parts.each { sPart ->
	    new File( fPart+"/"+sPart ).mkdirs()
	}
    }
}

def create3dStructure(parts) {
    parts.each{ fPart ->
        parts.each { sPart ->
	    parts.each { mPart ->
	        new File( fPart+"/"+sPart+"/"+mPart ).mkdirs()
	}
    }
}

def createParts(valid) {
    parts = []
    valid.each{ c -> 
        valid.each { d ->
            if (c.equals("0")) {
	       parts.add(d)
	    }
	    else {
	        parts.add(c+d)
	    }
	}
    }
    parts
}

def main() {
    if( args.size() < 1 ) {
    	usage()
	return
    }
    def depth = args[0]
    def valid = "0123456789abcdef"

    if (depth.equals("2")) {
       create2dStructure(createParts(valid))
    }
    else if ( depth.equals("3") ) {
       create3dStructure(createParts(valid))
    }
}

main()