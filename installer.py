import platform
import ctypes, sys

if not platform.system() == "Windows":
  print("The installer isnt supported on your os yet! To get the service, install the manual way")
  exit()

def is_admin():
    try:
        return ctypes.windll.shell32.IsUserAnAdmin()
    except:
        return False
    
if is_admin():
    print("yoo")
else:
    ctypes.windll.shell32.ShellExecuteW(None, "runas", sys.executable, " ".join(sys.argv), None, 1)