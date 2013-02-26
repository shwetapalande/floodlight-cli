package net.floodlightcontroller.cli;

/*
* Copyright (c) 2013, California Institute of Technology
* ALL RIGHTS RESERVED.
* Based on Government Sponsored Research DE-SC0007346
* Author Michael Bredel <michael.bredel@cern.ch>
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*     http://www.apache.org/licenses/LICENSE-2.0
* 
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
* "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
* LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
* A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
* HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
* INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
* BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
* OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
* AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
* LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
* WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
* POSSIBILITY OF SUCH DAMAGE.
* 
* Neither the name of the California Institute of Technology
* (Caltech) nor the names of its contributors may be used to endorse
* or promote products derived from this software without specific prior
* written permission.
*/

import java.io.IOException;
import java.util.Collection;

import jline.console.completer.Completer;

/**
 * Console interface.
 * 
 * @author Michael Bredel <michael.bredel@cern.ch>
 */
public interface IConsole {

	/**
	 * Sets the prompt of the current console. Thus, we
	 * can adapt the console prompt to specific commands.
	 */
	public abstract void setPrompt(String prompt);

	/**
	 * Gets the prompt of the current console.
	 */
	public abstract String getPrompt();
	
	/**
	 * Gets all the completer attached to the current console.
	 */
	public abstract Collection<Completer> getCompleters();

	/**
	 * Writes a string to the console prompt.
	 * 
	 * @param string String to write to the console prompt.
	 * @throws IOException 
	 */
	public abstract void write(String string) throws IOException;

}
